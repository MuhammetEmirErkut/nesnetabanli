package DuckProject.src.model.behavior.quack;

/**
 * Gerçek ötme davranışı implementasyonu.
 * Bu sınıf, gerçek ördekler gibi ötme davranışını sağlar.
 * Örneğin: MallardDuck, RedheadDuck gibi gerçek ördekler.
 */
public class Quack implements QuackBehavior {
    /**
     * Gerçek ördek ötme davranışını gerçekleştirir.
     * Klasik "Quack" sesini çıkarır.
     */
    @Override
    public void quack() {
        System.out.println("Vak");
    }
}
