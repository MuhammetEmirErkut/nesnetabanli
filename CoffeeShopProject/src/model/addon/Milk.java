// TODO: Milk sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.addon;

public class Milk extends Addon {
    public Milk(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getName() {
        return "Süt";
    }
}
