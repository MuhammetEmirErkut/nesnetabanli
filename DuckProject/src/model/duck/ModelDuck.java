package DuckProject.src.model.duck;

import DuckProject.src.model.behavior.fly.FlyNoWay;
import DuckProject.src.model.behavior.quack.Quack;

/**
 * ModelDuck - Model ördek.
 * Başlangıçta uçamayan bir ördektir, ancak:
 * - Runtime'da davranışı değiştirilebilir (setFlyBehavior ile)
 * - Örneğin: Roket gücü eklenebilir (FlyRocketPowered)
 */
public class ModelDuck extends Duck {
    /**
     * ModelDuck constructor'ı.
     * Constructor'da davranışları initialize ediyoruz.
     * Başlangıçta:
     * - FlyNoWay ile uçamaz
     * - Quack ile ötebilir
     * Ancak runtime'da setFlyBehavior() ile davranış değiştirilebilir.
     */
    public ModelDuck() {
        // Başlangıçta model ördek uçamaz
        flyBehavior = new FlyNoWay();
        // Model ördek ötebilir
        quackBehavior = new Quack();
    }
    
    /**
     * ModelDuck'un görünümünü gösterir.
     * Her ördek tipi kendi görünümünü implement eder.
     */
    @Override
    public void display() {
        System.out.println("Ben bir model ördeğim");
    }
}
