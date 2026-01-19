// TODO: Sugar sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.addon;

public class Sugar extends Addon {
    public Sugar(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return 0.5;
    }

    @Override
    public String getName() {
        return "Şeker";
    }
}