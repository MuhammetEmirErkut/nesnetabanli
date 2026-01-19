package DuckProject.src.test;

import DuckProject.src.model.duck.*;
import DuckProject.src.model.behavior.fly.FlyRocketPowered;

/**
 * MiniDuckSimulator - SimUDuck uygulamasının test sınıfı.
 * 
 * Bu sınıf, Strategy Pattern'in nasıl çalıştığını gösterir:
 * 1. Farklı ördek tiplerinin farklı davranışları vardır
 * 2. Davranışlar runtime'da değiştirilebilir
 * 3. Her ördek kendi davranış nesnelerine sahiptir (composition)
 */
public class MiniDuckSimulator {
    /**
     * Ana metod - Test senaryolarını çalıştırır.
     * 
     * @param args Komut satırı argümanları (kullanılmıyor)
     */
    public static void main(String[] args) {
        System.out.println("=== SimUDuck Test Senaryoları ===\n");
        
        // Test 1: MallardDuck (Yeşilbaş ördek)
        // Gerçek ördek: uçabilir ve ötebilir
        System.out.println("1. MallardDuck Testi:");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();  // Gerçek ötme sesi
        mallard.performFly();     // Kanatlı uçma
        System.out.println();
        
        // Test 2: ModelDuck (Model ördek)
        // Başlangıçta uçamaz, ancak runtime'da davranış değiştirilebilir
        System.out.println("2. ModelDuck Testi (Dinamik Davranış Değişimi):");
        Duck model = new ModelDuck();
        model.display();
        model.performFly();  // İlk durum: uçamaz
        
        // Runtime'da davranışı değiştir: Roket gücü ekle
        System.out.println("Roket gücü ekleniyor...");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();  // Artık roket gücüyle uçabilir!
        System.out.println();
        
        // Test 3: RubberDuck (Lastik ördek)
        // Oyuncak ördek: uçamaz, cıyaklama sesi çıkarır
        System.out.println("3. RubberDuck Testi:");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();  // Cıyaklama sesi
        rubber.performFly();    // Uçamaz
        System.out.println();
        
        // Test 4: DecoyDuck (Tuzak ördek)
        // Tuzak ördek: uçamaz, ses çıkarmaz
        System.out.println("4. DecoyDuck Testi:");
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();  // Sessizlik
        decoy.performFly();    // Uçamaz
        System.out.println();
        
        // Test 5: RedheadDuck (Kızılbaş ördek)
        // Gerçek ördek: uçabilir ve ötebilir
        System.out.println("5. RedheadDuck Testi:");
        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performQuack();  // Gerçek ötme sesi
        redhead.performFly();     // Kanatlı uçma
        System.out.println();
        
        System.out.println("=== Tüm Testler Tamamlandı ===");
        System.out.println("\nStrategy Pattern'in Avantajları:");
        System.out.println("✓ Davranışlar Duck sınıfından ayrıldı (encapsulation)");
        System.out.println("✓ Yeni davranışlar kolayca eklenebilir (extensibility)");
        System.out.println("✓ Davranışlar runtime'da değiştirilebilir (flexibility)");
        System.out.println("✓ Kod tekrarı yok (code reuse)");
    }
}
