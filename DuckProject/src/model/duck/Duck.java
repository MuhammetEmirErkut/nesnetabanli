package DuckProject.src.model.duck;

import DuckProject.src.model.behavior.fly.FlyBehavior;
import DuckProject.src.model.behavior.quack.QuackBehavior;

/**
 * Duck abstract sınıfı - Tüm ördeklerin üst sınıfı.
 * 
 * Strategy Pattern kullanarak:
 * - Uçma ve ötme davranışlarını Duck sınıfından ayırdık
 * - Bu sayede davranışları bağımsız olarak değiştirebilir ve genişletebiliriz
 * - Her ördek, kendi davranış nesnelerine sahiptir (composition)
 * 
 * Design Principles:
 * 1. "Değişen kısımları ayır ve kapsülle" - fly() ve quack() davranışları ayrıldı
 * 2. "Interface'e programla, implementasyona değil" - FlyBehavior ve QuackBehavior interface'lerine programlıyoruz
 */
public abstract class Duck {
    /**
     * Uçma davranışı için referans.
     * Interface tipinde tanımlanmıştır, böylece farklı uçma davranışlarını dinamik olarak atayabiliriz.
     * HAS-A ilişkisi: Duck bir FlyBehavior'ı sahiptir (composition).
     */
    protected FlyBehavior flyBehavior;
    
    /**
     * Ötme davranışı için referans.
     * Interface tipinde tanımlanmıştır, böylece farklı ötme davranışlarını dinamik olarak atayabiliriz.
     * HAS-A ilişkisi: Duck bir QuackBehavior'ı sahiptir (composition).
     */
    protected QuackBehavior quackBehavior;
    
    /**
     * Varsayılan constructor.
     * Alt sınıflar kendi constructor'larında davranışları atayacak.
     */
    public Duck() {
    }
    
    /**
     * Ördeğin görünümünü gösterir.
     * Her ördek tipi kendi görünümünü implement eder (abstract metod).
     */
    public abstract void display();
    
    /**
     * Uçma davranışını gerçekleştirir.
     * Duck sınıfı uçma davranışını kendisi yapmaz, bunun yerine
     * flyBehavior nesnesine delegasyon yapar (delegation pattern).
     * Bu sayede davranışı runtime'da değiştirebiliriz.
     */
    public void performFly() {
        flyBehavior.fly();
    }
    
    /**
     * Ötme davranışını gerçekleştirir.
     * Duck sınıfı ötme davranışını kendisi yapmaz, bunun yerine
     * quackBehavior nesnesine delegasyon yapar (delegation pattern).
     * Bu sayede davranışı runtime'da değiştirebiliriz.
     */
    public void performQuack() {
        quackBehavior.quack();
    }
    
    /**
     * Tüm ördekler yüzebilir.
     * Bu davranış tüm ördekler için aynıdır, bu yüzden burada implement edilmiştir.
     */
    public void swim() {
        System.out.println("Tüm ördekler yüzer, hatta tuzak ördekler bile!");
    }
    
    /**
     * Uçma davranışını dinamik olarak değiştirmek için setter metodu.
     * Bu metod sayesinde bir ördeğin uçma davranışını runtime'da değiştirebiliriz.
     * Örneğin: ModelDuck'a roket gücü eklemek için kullanılabilir.
     * 
     * @param fb Yeni uçma davranışı
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    
    /**
     * Ötme davranışını dinamik olarak değiştirmek için setter metodu.
     * Bu metod sayesinde bir ördeğin ötme davranışını runtime'da değiştirebiliriz.
     * 
     * @param qb Yeni ötme davranışı
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
