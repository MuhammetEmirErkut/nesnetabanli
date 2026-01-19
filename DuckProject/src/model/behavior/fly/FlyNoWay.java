package DuckProject.src.model.behavior.fly;

/**
 * Uçamama davranışı implementasyonu.
 * Bu sınıf, uçamayan ördekler için davranışı sağlar.
 * Örneğin: RubberDuck (lastik ördek), DecoyDuck (tuzak ördek) gibi.
 */
public class FlyNoWay implements FlyBehavior {
    /**
     * Uçamama davranışını gerçekleştirir.
     * Bu ördekler uçamadığı için hiçbir şey yapmaz veya uçamadığını belirtir.
     */
    @Override
    public void fly() {
        System.out.println("Uçamıyorum");
    }
}
