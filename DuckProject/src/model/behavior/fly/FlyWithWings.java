package DuckProject.src.model.behavior.fly;

/**
 * Kanatlı uçma davranışı implementasyonu.
 * Bu sınıf, gerçekten uçabilen ördekler için uçma davranışını sağlar.
 * Örneğin: MallardDuck, RedheadDuck gibi gerçek ördekler.
 */
public class FlyWithWings implements FlyBehavior {
    /**
     * Kanatlı uçma davranışını gerçekleştirir.
     * Gerçek ördekler gibi uçma simülasyonu yapar.
     */
    @Override
    public void fly() {
        System.out.println("Uçuyorum!!");
    }
}
