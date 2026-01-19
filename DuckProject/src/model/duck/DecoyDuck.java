package DuckProject.src.model.duck;

import DuckProject.src.model.behavior.fly.FlyNoWay;
import DuckProject.src.model.behavior.quack.MuteQuack;

/**
 * DecoyDuck - Tuzak ördek.
 * Avcıların kullandığı sahte bir ördektir, bu yüzden:
 * - Uçamaz (FlyNoWay)
 * - Ses çıkarmaz (MuteQuack)
 */
public class DecoyDuck extends Duck {
    /**
     * DecoyDuck constructor'ı.
     * Constructor'da davranışları initialize ediyoruz.
     * Bu ördek tuzak olduğu için:
     * - FlyNoWay ile uçamaz
     * - MuteQuack ile ses çıkarmaz
     */
    public DecoyDuck() {
        // Tuzak ördekler uçamaz
        flyBehavior = new FlyNoWay();
        // Tuzak ördekler ses çıkarmaz
        quackBehavior = new MuteQuack();
    }
    
    /**
     * DecoyDuck'un görünümünü gösterir.
     * Her ördek tipi kendi görünümünü implement eder.
     */
    @Override
    public void display() {
        System.out.println("Ben bir tuzak ördeğim");
    }
}
