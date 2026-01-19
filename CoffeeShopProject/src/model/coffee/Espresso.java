// TODO: Espresso sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki gereksinimler

package CoffeeShopProject.src.model.coffee;

import java.util.List;

import CoffeeShopProject.src.model.addon.*;
import CoffeeShopProject.src.model.size.SizeBehavior;

public class Espresso extends Coffee {
    public Espresso(String name, double basePrice, List<Addon> addons, SizeBehavior sizeBehavior) {
        super(name, basePrice, addons, sizeBehavior);
    }

    @Override
    public void prepare() {
        System.out.println("Espresso hazırlanıyor... Yoğun ve güçlü kahve demleniyor.");
    }

    @Override
    public String getDescription() {
        return "Yoğun ve güçlü espresso kahvesi";
    }

    @Override
    public String toString() {
        return "Kahve: " + name + "\nAçıklama: " + getDescription() + "\nBoyut: " + sizeBehavior.getSizeName()
                + "\nEkstra Malzemeler: " + addons.toString() + "\nToplam Fiyat: " + calculatePrice() + " TL";
    }
}
