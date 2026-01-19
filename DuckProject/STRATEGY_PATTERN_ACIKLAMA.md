# Strategy Pattern (Strateji Deseni) Açıklaması

## 📚 Strategy Pattern Nedir?

**Strategy Pattern** (Strateji Deseni), bir algoritma ailesini tanımlayan, bunları sınıflar halinde kapsülleyen ve bunları birbirinin yerine kullanılabilir hale getiren bir tasarım desenidir. Bu desen, algoritmaları kullanan istemciden bağımsız hale getirir ve algoritmaları runtime'da değiştirilebilir kılar.

## 🎯 Problem: Neden Strategy Pattern'e İhtiyaç Duyarız?

### Senaryo: SimUDuck Projesi

Başlangıçta, tüm ördekler için tek bir `Duck` sınıfı vardı ve tüm ördekler aynı şekilde uçuyor ve ötüyordu. Ancak:

1. **RubberDuck** (Lastik ördek) uçamaz ve cıyaklama sesi çıkarır
2. **DecoyDuck** (Tuzak ördek) uçamaz ve ses çıkarmaz
3. **MallardDuck** (Yeşilbaş ördek) uçar ve gerçek ötme sesi çıkarır
4. **ModelDuck** (Model ördek) başlangıçta uçamaz ama runtime'da roket gücü kazanabilir

### ❌ Kötü Çözüm: Inheritance (Kalıtım)

```java
// Kötü yaklaşım - Inheritance kullanımı
public class Duck {
    public void fly() {
        // Tüm ördekler uçar - YANLIŞ!
    }
    public void quack() {
        // Tüm ördekler öter - YANLIŞ!
    }
}

public class RubberDuck extends Duck {
    @Override
    public void fly() {
        // Hiçbir şey yapma - Kod tekrarı ve esneklik yok
    }
    @Override
    public void quack() {
        // Cıyaklama - Her yerde aynı kod
    }
}
```

**Sorunlar:**
- ❌ Kod tekrarı (DRY prensibi ihlali)
- ❌ Runtime'da davranış değiştirilemez
- ❌ Yeni davranış eklemek zor (tüm alt sınıfları değiştirmek gerekir)
- ❌ Bakım zorluğu (bir davranışı değiştirmek için birçok sınıfı güncellemek gerekir)

### ✅ İyi Çözüm: Strategy Pattern

Strategy Pattern ile davranışları ayrı sınıflara taşıdık:

```java
// Interface - Davranış tanımı
public interface FlyBehavior {
    void fly();
}

// Concrete Strategy - Gerçek uçma davranışı
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Uçuyorum!!");
    }
}

// Concrete Strategy - Uçamama davranışı
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Uçamıyorum");
    }
}

// Context - Duck sınıfı
public abstract class Duck {
    protected FlyBehavior flyBehavior;  // Composition (HAS-A)
    
    public void performFly() {
        flyBehavior.fly();  // Delegation (Delegasyon)
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;  // Runtime'da değiştirilebilir
    }
}
```

## 🏗️ Strategy Pattern Yapısı

Strategy Pattern üç ana bileşenden oluşur:

### 1. **Strategy Interface (Strateji Arayüzü)**
   - Davranışlar için ortak interface tanımlar
   - Örnek: `FlyBehavior`, `QuackBehavior`

### 2. **Concrete Strategy (Somut Strateji)**
   - Interface'i implement eden somut davranış sınıfları
   - Örnek: `FlyWithWings`, `FlyNoWay`, `Quack`, `Squeak`

### 3. **Context (Bağlam)**
   - Strategy'leri kullanan sınıf
   - Strategy referansına sahiptir (composition)
   - Örnek: `Duck` sınıfı

## 📊 UML Diyagramı

```
┌─────────────────────┐
│   Strategy (Interface) │
│   + execute()        │
└─────────────────────┘
         ▲
         │ implements
         │
    ┌────┴────┐
    │         │
┌───┴───┐ ┌──┴────┐
│Concrete│ │Concrete│
│Strategy│ │Strategy│
│   A    │ │   B    │
└────────┘ └────────┘

┌─────────────────────┐
│      Context         │
│ -strategy: Strategy  │
│ +setStrategy()      │
│ +executeStrategy()  │
└─────────────────────┘
```

## 💡 Strategy Pattern'in Avantajları

### 1. **Encapsulation (Kapsülleme)**
   - Davranışlar ayrı sınıflarda kapsüllenir
   - Duck sınıfı davranış detaylarını bilmez

### 2. **Flexibility (Esneklik)**
   - Runtime'da davranış değiştirilebilir
   ```java
   Duck model = new ModelDuck();
   model.setFlyBehavior(new FlyRocketPowered());  // Dinamik değişim!
   ```

### 3. **Extensibility (Genişletilebilirlik)**
   - Yeni davranışlar kolayca eklenebilir
   - Mevcut kodu değiştirmeden yeni stratejiler eklenir
   ```java
   // Yeni bir uçma davranışı eklemek için sadece yeni bir sınıf yeterli
   public class FlyWithJetpack implements FlyBehavior {
       public void fly() {
           System.out.println("Jetpack ile uçuyorum!");
       }
   }
   ```

### 4. **Code Reuse (Kod Tekrarını Önleme)**
   - Aynı davranış farklı context'lerde kullanılabilir
   - Kod tekrarı yok

### 5. **Open/Closed Principle (Açık/Kapalı Prensip)**
   - Mevcut kodu değiştirmeden yeni özellikler eklenebilir
   - Genişlemeye açık, değişikliğe kapalı

## 🔄 Strategy Pattern vs Inheritance

| Özellik | Inheritance (Kalıtım) | Strategy Pattern |
|---------|----------------------|------------------|
| **Davranış Değişimi** | Compile-time (Derleme zamanı) | Runtime (Çalışma zamanı) |
| **Kod Tekrarı** | Var (override gerekir) | Yok (composition) |
| **Esneklik** | Düşük | Yüksek |
| **Bakım** | Zor (birçok sınıfı değiştirmek gerekir) | Kolay (sadece ilgili strategy) |
| **Genişletilebilirlik** | Sınırlı | Yüksek |

## 🎓 Design Principles (Tasarım Prensipleri)

Strategy Pattern şu prensipleri uygular:

### 1. **Identify the aspects that vary and separate them from what stays the same**
   (Değişen kısımları ayır ve sabit kısımlardan ayır)
   - ✅ Uçma ve ötme davranışları değişken → Ayrıldı
   - ✅ Duck sınıfının temel yapısı sabit → Korundu

### 2. **Program to an interface, not an implementation**
   (Interface'e programla, implementasyona değil)
   - ✅ `FlyBehavior` ve `QuackBehavior` interface'lerine programlıyoruz
   - ✅ Concrete sınıflara bağımlı değiliz

### 3. **Favor composition over inheritance**
   (Kalıtım yerine kompozisyonu tercih et)
   - ✅ Duck sınıfı FlyBehavior ve QuackBehavior'a sahip (HAS-A)
   - ✅ Duck sınıfı davranışları inherit etmiyor (IS-A değil)

## 📝 SimUDuck Projesinde Strategy Pattern

### Klasör Yapısı

```
DuckProject/src/model/
├── behavior/              ← Strategy'ler burada
│   ├── fly/              ← FlyBehavior stratejileri
│   │   ├── FlyBehavior.java          (Strategy Interface)
│   │   ├── FlyWithWings.java         (Concrete Strategy)
│   │   ├── FlyNoWay.java             (Concrete Strategy)
│   │   └── FlyRocketPowered.java     (Concrete Strategy)
│   └── quack/            ← QuackBehavior stratejileri
│       ├── QuackBehavior.java        (Strategy Interface)
│       ├── Quack.java                (Concrete Strategy)
│       ├── Squeak.java               (Concrete Strategy)
│       └── MuteQuack.java            (Concrete Strategy)
└── duck/                 ← Context sınıfları
    ├── Duck.java                     (Context - Abstract)
    ├── MallardDuck.java              (Context - Concrete)
    ├── RedheadDuck.java              (Context - Concrete)
    ├── RubberDuck.java               (Context - Concrete)
    ├── DecoyDuck.java                (Context - Concrete)
    └── ModelDuck.java                (Context - Concrete)
```

### Kod Örneği

```java
// 1. Strategy Interface
public interface FlyBehavior {
    void fly();
}

// 2. Concrete Strategies
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Uçuyorum!!");
    }
}

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Uçamıyorum");
    }
}

// 3. Context
public abstract class Duck {
    protected FlyBehavior flyBehavior;  // Composition
    
    public void performFly() {
        flyBehavior.fly();  // Delegation
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;  // Runtime'da değiştirilebilir
    }
}

// 4. Concrete Context
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();  // Strategy ataması
    }
}

// 5. Kullanım
Duck mallard = new MallardDuck();
mallard.performFly();  // "Uçuyorum!!" çıktısı

// Runtime'da davranış değiştirme
mallard.setFlyBehavior(new FlyNoWay());
mallard.performFly();  // "Uçamıyorum" çıktısı
```

## 🚀 Ne Zaman Strategy Pattern Kullanılır?

Strategy Pattern şu durumlarda kullanılmalıdır:

1. ✅ **Birçok farklı algoritma/varyasyon varsa**
   - Örnek: Farklı ödeme yöntemleri (Kredi kartı, Nakit, Kripto)

2. ✅ **Algoritmalar runtime'da değiştirilmeli ise**
   - Örnek: Oyun zorluk seviyeleri (Kolay, Orta, Zor)

3. ✅ **Kod tekrarını önlemek istiyorsanız**
   - Örnek: Farklı sıralama algoritmaları (Bubble, Quick, Merge)

4. ✅ **Conditional if-else/switch bloklarından kaçınmak istiyorsanız**
   ```java
   // Kötü: if-else kullanımı
   if (type == "A") {
       // algoritma A
   } else if (type == "B") {
       // algoritma B
   }
   
   // İyi: Strategy Pattern
   strategy.execute();
   ```

## 🎯 Gerçek Dünya Örnekleri

### 1. **Ödeme Sistemleri**
```java
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy { ... }
class PayPalPayment implements PaymentStrategy { ... }
class CryptoPayment implements PaymentStrategy { ... }
```

### 2. **Sıralama Algoritmaları**
```java
interface SortStrategy {
    void sort(int[] array);
}

class QuickSort implements SortStrategy { ... }
class MergeSort implements SortStrategy { ... }
class BubbleSort implements SortStrategy { ... }
```

### 3. **Oyun Zorluk Seviyeleri**
```java
interface DifficultyStrategy {
    void adjustGame();
}

class EasyDifficulty implements DifficultyStrategy { ... }
class HardDifficulty implements DifficultyStrategy { ... }
```

## 📚 Özet

Strategy Pattern:
- ✅ Algoritma ailelerini kapsüller
- ✅ Runtime'da algoritma değiştirmeye izin verir
- ✅ Kod tekrarını önler
- ✅ Open/Closed Principle'ı uygular
- ✅ Composition over Inheritance prensibini kullanır

**Anahtar Nokta:** Strategy Pattern, "nasıl yapılacağını" (how) değil, "ne yapılacağını" (what) tanımlar ve farklı "nasıl"ları birbirinin yerine kullanılabilir hale getirir.

---

**SimUDuck Projesi**, Strategy Pattern'in klasik ve mükemmel bir örneğidir! 🦆
