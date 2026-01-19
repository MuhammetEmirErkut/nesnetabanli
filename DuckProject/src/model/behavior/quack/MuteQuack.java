package DuckProject.src.model.behavior.quack;

/**
 * Sessizlik davranışı implementasyonu.
 * Bu sınıf, hiç ses çıkarmayan ördekler için davranışı sağlar.
 * Örneğin: DecoyDuck (tuzak ördek) gibi.
 */
public class MuteQuack implements QuackBehavior {
    /**
     * Sessizlik davranışını gerçekleştirir.
     * Bu ördekler ses çıkarmadığı için hiçbir şey yapmaz veya sessizliği belirtir.
     */
    @Override
    public void quack() {
        System.out.println("<< Sessizlik >>");
    }
}
