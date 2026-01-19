package CoffeeShopProject.src.model.addon;
// TODO: Addon sınıfını buraya yazın

// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

public abstract class Addon {
    protected String name;
    protected double price;

    public Addon(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + String.valueOf(price);
    }
}