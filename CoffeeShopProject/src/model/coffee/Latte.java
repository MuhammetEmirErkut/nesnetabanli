// TODO: Latte sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.coffee;

import java.util.List;

import CoffeeShopProject.src.model.addon.*;
import CoffeeShopProject.src.model.size.SizeBehavior;

public class Latte extends Coffee {
    public Latte(String name, double basePrice, List<Addon> addons, SizeBehavior sizeBehavior) {
        super(name, basePrice, addons, sizeBehavior);
    }

    @Override
    public void prepare() {
        System.out.println("Latte hazırlanıyor... Espresso üzerine buharda ısıtılmış süt ekleniyor.");
    }

    @Override
    public String getDescription() {
        return "Espresso ve buharda ısıtılmış sütlü latte";
    }

    @Override
    public String toString() {
        return "Kahve: " + name + "\nAçıklama: " + getDescription() + "\nBoyut: " + sizeBehavior.getSizeName()
                + "\nEkstra Malzemeler: " + addons.toString() + "\nToplam Fiyat: " + calculatePrice() + " TL";
    }
}
