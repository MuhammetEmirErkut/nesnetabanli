// TODO: MediumSize sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.size;

public class MediumSize implements SizeBehavior {
    @Override
    public double getPriceMultiplier() {
        return 1.0;
    }

    @Override
    public String getSizeName() {
        return "Orta";
    }
}
