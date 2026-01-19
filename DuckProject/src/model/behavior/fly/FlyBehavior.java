package DuckProject.src.model.behavior.fly;

/**
 * Uçma davranışı için interface.
 * Strategy Pattern kullanarak, uçma davranışını Duck sınıfından ayırdık.
 * Bu sayede farklı uçma davranışlarını kolayca ekleyebilir ve değiştirebiliriz.
 * Her uçma davranışı bu interface'i implement eder.
 */
public interface FlyBehavior {
    /**
     * Uçma davranışını gerçekleştiren metod.
     * Her uçma davranışı kendi implementasyonunu sağlar.
     */
    void fly();
}
