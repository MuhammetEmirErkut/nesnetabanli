package DuckProject.src.model.behavior.quack;

/**
 * Cıyaklama davranışı implementasyonu.
 * Bu sınıf, lastik ördek gibi oyuncak ördekler için cıyaklama davranışını sağlar.
 * Örneğin: RubberDuck (lastik ördek).
 */
public class Squeak implements QuackBehavior {
    /**
     * Cıyaklama davranışını gerçekleştirir.
     * Lastik ördek gibi cıyaklama sesi çıkarır.
     */
    @Override
    public void quack() {
        System.out.println("Cıyak");
    }
}
