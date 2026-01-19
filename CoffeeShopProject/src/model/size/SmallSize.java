// TODO: SmallSize sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.size;

public class SmallSize implements SizeBehavior {
    @Override
    public double getPriceMultiplier() {
        return 0.8;
    }

    @Override
    public String getSizeName() {
        return "Küçük";
    }
}
