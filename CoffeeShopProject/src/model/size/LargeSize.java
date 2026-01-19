// TODO: LargeSize sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.size;

public class LargeSize implements SizeBehavior {
    @Override
    public double getPriceMultiplier() {
        return 1.3;
    }

    @Override
    public String getSizeName() {
        return "Büyük";
    }
}
