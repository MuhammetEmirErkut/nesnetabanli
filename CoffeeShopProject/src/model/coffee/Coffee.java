package CoffeeShopProject.src.model.coffee;

import java.util.List;

import CoffeeShopProject.src.model.addon.*;
import CoffeeShopProject.src.model.size.SizeBehavior;

// TODO: Coffee abstract sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

public abstract class Coffee {
    protected String name;
    protected double basePrice;
    protected List<Addon> addons;
    protected SizeBehavior sizeBehavior;

    public Coffee(String name, double basePrice, List<Addon> addons, SizeBehavior sizeBehavior) {
        this.name = name;
        this.basePrice = basePrice;
        this.addons = addons;
        this.sizeBehavior = sizeBehavior;
    }

    public abstract void prepare();

    public abstract String getDescription();

    public void setSize(SizeBehavior size) {
        this.sizeBehavior = size;
    }

    public void addAddon(Addon addon) {
        addons.add(addon);
    }

    public double calculatePrice() {
        double total = basePrice;
        total += sizeBehavior.getPriceMultiplier() * basePrice;
        for (Addon addon : addons) {
            total += addon.getPrice();
        }
        return total;
    }

}