package DuckProject.src.model.behavior.fly;

/**
 * Roket gücüyle uçma davranışı implementasyonu.
 * Bu sınıf, özel durumlar için roket gücüyle uçma davranışını sağlar.
 * Örneğin: ModelDuck gibi ördeklerin dinamik olarak roket gücü kazanması.
 */
public class FlyRocketPowered implements FlyBehavior {
    /**
     * Roket gücüyle uçma davranışını gerçekleştirir.
     * Özel bir uçma davranışı simülasyonu yapar.
     */
    @Override
    public void fly() {
        System.out.println("Roket gücüyle uçuyorum!");
    }
}
