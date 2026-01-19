package DuckProject.src.model.duck;

import DuckProject.src.model.behavior.fly.FlyWithWings;
import DuckProject.src.model.behavior.quack.Quack;

/**
 * MallardDuck - Yeşilbaş ördek.
 * Gerçek bir ördek türüdür, bu yüzden:
 * - Kanatlı uçma davranışına sahiptir (FlyWithWings)
 * - Gerçek ötme davranışına sahiptir (Quack)
 */
public class MallardDuck extends Duck {
    /**
     * MallardDuck constructor'ı.
     * Constructor'da davranışları initialize ediyoruz.
     * Bu ördek gerçek bir ördek olduğu için:
     * - FlyWithWings ile uçabilir
     * - Quack ile ötebilir
     */
    public MallardDuck() {
        // Gerçek ördekler kanatlarıyla uçar
        flyBehavior = new FlyWithWings();
        // Gerçek ördekler gerçek ötme sesi çıkarır
        quackBehavior = new Quack();
    }
    
    /**
     * MallardDuck'un görünümünü gösterir.
     * Her ördek tipi kendi görünümünü implement eder.
     */
    @Override
    public void display() {
        System.out.println("Ben gerçek bir yeşilbaş ördeğim");
    }
}
