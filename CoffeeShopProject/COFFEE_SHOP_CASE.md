# ☕ Coffee Shop Projesi - Nesne Yönelimli Programlama Alıştırması

## 📋 Proje Açıklaması

Bu proje, bir kahve dükkanı sistemini simüle eden nesne yönelimli bir uygulamadır. Proje, **inheritance**, **polymorphism**, **composition** ve **strategy pattern** gibi önemli OOP prensiplerini kullanır.

## 🎯 Öğrenme Hedefleri

- Abstract sınıf kullanımı
- Inheritance (Kalıtım) ilişkileri
- Polymorphism (Çok biçimlilik)
- Composition (Bileşim) ilişkileri
- Strategy Pattern uygulaması
- Interface kullanımı

## 📁 Proje Yapısı

```
CoffeeShopProject/
├── src/
│   ├── model/
│   │   ├── coffee/
│   │   │   ├── Coffee.java (Abstract sınıf - SİZ YAZACAKSINIZ)
│   │   │   ├── Espresso.java (SİZ YAZACAKSINIZ)
│   │   │   └── Latte.java (SİZ YAZACAKSINIZ)
│   │   ├── size/
│   │   │   ├── SizeBehavior.java (Interface - SİZ YAZACAKSINIZ)
│   │   │   ├── SmallSize.java (SİZ YAZACAKSINIZ)
│   │   │   ├── MediumSize.java (SİZ YAZACAKSINIZ)
│   │   │   └── LargeSize.java (SİZ YAZACAKSINIZ)
│   │   └── addon/
│   │       ├── Addon.java (SİZ YAZACAKSINIZ)
│   │       ├── Milk.java (SİZ YAZACAKSINIZ)
│   │       └── Sugar.java (SİZ YAZACAKSINIZ)
│   └── test/
│       └── CoffeeShopTest.java (Test sınıfı - SİZ YAZACAKSINIZ)
└── COFFEE_SHOP_CASE.md (Bu dosya)
```

## 📝 Görevler ve Gereksinimler

### 1. Coffee Abstract Sınıfı (`Coffee.java`)

**Özellikler:**
- `protected SizeBehavior sizeBehavior` - Kahvenin boyutu için referans (composition)
- `protected String name` - Kahvenin adı
- `protected double basePrice` - Kahvenin temel fiyatı
- `protected List<Addon> addons` - Ekstra malzemeler listesi (composition)

**Metodlar:**
- `public abstract void prepare()` - Kahvenin hazırlanma şeklini gösterir (her kahve tipi kendi implementasyonunu yazacak)
- `public abstract String getDescription()` - Kahvenin açıklamasını döner
- `public void setSize(SizeBehavior size)` - Kahvenin boyutunu değiştirir
- `public void addAddon(Addon addon)` - Ekstra malzeme ekler
- `public double calculatePrice()` - Toplam fiyatı hesaplar (temel fiyat + boyut fiyatı + ekstra malzemeler)
- `public void display()` - Kahvenin tüm bilgilerini gösterir (ad, açıklama, boyut, ekstra malzemeler, fiyat)

**Not:** `calculatePrice()` metodunda:
- Temel fiyat: `basePrice`
- Boyut fiyatı: `sizeBehavior.getPriceMultiplier() * basePrice`
- Ekstra malzemeler: Her addon'un `getPrice()` değerini topla
- Toplam = basePrice + (boyut fiyatı - basePrice) + ekstra malzemeler toplamı

### 2. Kahve Tipleri

Her kahve tipi `Coffee` sınıfından türetilecek:

#### Espresso (`Espresso.java`)
- Temel fiyat: 15.0 TL
- Constructor'da: `sizeBehavior = new MediumSize()` (varsayılan)
- `prepare()`: "Espresso hazırlanıyor... Yoğun ve güçlü kahve demleniyor."
- `getDescription()`: "Yoğun ve güçlü espresso kahvesi"

#### Latte (`Latte.java`)
- Temel fiyat: 20.0 TL
- Constructor'da: `sizeBehavior = new MediumSize()` (varsayılan)
- `prepare()`: "Latte hazırlanıyor... Espresso üzerine buharda ısıtılmış süt ekleniyor."
- `getDescription()`: "Espresso ve buharda ısıtılmış sütlü latte"

### 3. SizeBehavior Interface (`SizeBehavior.java`)

**Metodlar:**
- `double getPriceMultiplier()` - Fiyat çarpanını döner
- `String getSizeName()` - Boyut adını döner

**Implementasyonlar:**
- `SmallSize`: Çarpan = 0.8, Ad = "Küçük"
- `MediumSize`: Çarpan = 1.0, Ad = "Orta"
- `LargeSize`: Çarpan = 1.3, Ad = "Büyük"

### 4. Addon Sınıfı (`Addon.java`)

**Özellikler:**
- `protected String name` - Ekstra malzeme adı
- `protected double price` - Ekstra malzeme fiyatı

**Metodlar:**
- Constructor: `Addon(String name, double price)`
- `public String getName()` - Malzeme adını döner
- `public double getPrice()` - Malzeme fiyatını döner
- `public String toString()` - Malzeme bilgisini string olarak döner

**Alt Sınıflar:**
- `Milk`: Fiyat = 3.0 TL, Ad = "Süt"
- `Sugar`: Fiyat = 1.0 TL, Ad = "Şeker"

### 5. Test Sınıfı (`CoffeeShopTest.java`)

Test senaryolarını içermelidir:

1. **Espresso Testi**: Küçük boy espresso, süt ve şeker ekle
2. **Latte Testi**: Büyük boy latte, süt ekle
3. **Espresso Testi 2**: Orta boy espresso, şeker ekle

## 💡 İpuçları

1. **Package yapısı**: `CoffeeShopProject.src.model.coffee`, `CoffeeShopProject.src.model.size`, vb.
2. **Import'lar**: Gerekli import'ları eklemeyi unutmayın (`java.util.List`, `java.util.ArrayList`)
3. **Constructor'lar**: Her sınıf için uygun constructor'ları yazın
4. **toString()**: Addon sınıfı için toString() metodunu override edin
5. **Null kontrolü**: `calculatePrice()` metodunda null kontrolleri yapın

## ✅ Beklenen Çıktı Örneği

```
=== Coffee Shop Test Senaryoları ===

1. Espresso Testi:
Espresso hazırlanıyor... Yoğun ve güçlü kahve demleniyor.
Kahve: Espresso
Açıklama: Yoğun ve güçlü espresso kahvesi
Boyut: Küçük
Ekstra Malzemeler: Süt (3.0 TL), Şeker (1.0 TL)
Toplam Fiyat: 16.0 TL

2. Latte Testi:
Latte hazırlanıyor... Espresso üzerine buharda ısıtılmış süt ekleniyor.
Kahve: Latte
Açıklama: Espresso ve buharda ısıtılmış sütlü latte
Boyut: Büyük
Ekstra Malzemeler: Süt (3.0 TL)
Toplam Fiyat: 29.0 TL

3. Espresso Testi 2:
Espresso hazırlanıyor... Yoğun ve güçlü kahve demleniyor.
Kahve: Espresso
Açıklama: Yoğun ve güçlü espresso kahvesi
Boyut: Orta
Ekstra Malzemeler: Şeker (1.0 TL)
Toplam Fiyat: 16.0 TL
```

## 🎓 Değerlendirme Kriterleri

- [ ] Abstract sınıf doğru kullanılmış mı?
- [ ] Inheritance ilişkileri doğru kurulmuş mu?
- [ ] Polymorphism doğru uygulanmış mı?
- [ ] Composition ilişkileri doğru kullanılmış mı?
- [ ] Strategy Pattern doğru uygulanmış mı?
- [ ] Tüm metodlar doğru implement edilmiş mi?
- [ ] Fiyat hesaplamaları doğru mu?
- [ ] Kod temiz ve okunabilir mi?

## 🚀 Başarılar!

Bu projeyi tamamladığınızda, nesne yönelimli programlamanın temel prensiplerini pekiştirmiş olacaksınız. İyi çalışmalar!
