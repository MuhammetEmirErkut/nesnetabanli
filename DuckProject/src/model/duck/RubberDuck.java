package DuckProject.src.model.duck;

import DuckProject.src.model.behavior.fly.FlyNoWay;
import DuckProject.src.model.behavior.quack.Squeak;

/**
 * RubberDuck - Lastik ördek.
 * Oyuncak bir ördektir, bu yüzden:
 * - Uçamaz (FlyNoWay)
 * - Cıyaklama sesi çıkarır (Squeak), gerçek ötme değil
 */
public class RubberDuck extends Duck {
    /**
     * RubberDuck constructor'ı.
     * Constructor'da davranışları initialize ediyoruz.
     * Bu ördek oyuncak olduğu için:
     * - FlyNoWay ile uçamaz
     * - Squeak ile cıyaklama sesi çıkarır
     */
    public RubberDuck() {
        // Lastik ördekler uçamaz
        flyBehavior = new FlyNoWay();
        // Lastik ördekler cıyaklama sesi çıkarır
        quackBehavior = new Squeak();
    }
    
    /**
     * RubberDuck'un görünümünü gösterir.
     * Her ördek tipi kendi görünümünü implement eder.
     */
    @Override
    public void display() {
        System.out.println("Ben bir lastik ördeğim");
    }
}
