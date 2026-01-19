package DuckProject.src.model.behavior.quack;

/**
 * Ötme davranışı için interface.
 * Strategy Pattern kullanarak, ötme davranışını Duck sınıfından ayırdık.
 * Bu sayede farklı ötme davranışlarını kolayca ekleyebilir ve değiştirebiliriz.
 * Her ötme davranışı bu interface'i implement eder.
 */
public interface QuackBehavior {
    /**
     * Ötme davranışını gerçekleştiren metod.
     * Her ötme davranışı kendi implementasyonunu sağlar.
     */
    void quack();
}
