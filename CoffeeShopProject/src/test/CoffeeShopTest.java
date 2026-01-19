// TODO: CoffeeShopTest sınıfını buraya yazın
// Bakınız: COFFEE_SHOP_CASE.md dosyasındaki test senaryoları

package CoffeeShopProject.src.test;

import java.util.ArrayList;

import CoffeeShopProject.src.model.coffee.Coffee;
import CoffeeShopProject.src.model.coffee.Espresso;
import CoffeeShopProject.src.model.coffee.Latte;
import CoffeeShopProject.src.model.addon.Addon;
import CoffeeShopProject.src.model.addon.Milk;
import CoffeeShopProject.src.model.addon.Sugar;
import CoffeeShopProject.src.model.size.SmallSize;
import CoffeeShopProject.src.model.size.MediumSize;
import CoffeeShopProject.src.model.size.LargeSize;

public class CoffeeShopTest {
    public static void main(String[] args) {
        System.out.println("=== Coffee Shop Test Senaryoları ===\n");

        // Test 1: Küçük boy Espresso, süt ve şeker ekle
        Coffee espresso1 = new Espresso("Espresso", 15.0, new ArrayList<Addon>(), new SmallSize());
        espresso1.addAddon(new Milk("Süt", 3.0));
        espresso1.addAddon(new Sugar("Şeker", 1.0));
        System.out.println("1. Espresso Testi:");
        espresso1.prepare();
        System.out.println(espresso1.toString());
        System.out.println();

        // Test 2: Büyük boy Latte, süt ekle
        Coffee latte = new Latte("Latte", 20.0, new ArrayList<Addon>(), new LargeSize());
        latte.addAddon(new Milk("Süt", 3.0));
        System.out.println("2. Latte Testi:");
        latte.prepare();
        System.out.println(latte.toString());
        System.out.println();

        // Test 3: Orta boy Espresso, şeker ekle
        Coffee espresso2 = new Espresso("Espresso", 15.0, new ArrayList<Addon>(), new MediumSize());
        espresso2.addAddon(new Sugar("Şeker", 1.0));
        System.out.println("3. Espresso Testi 2:");
        espresso2.prepare();
        System.out.println(espresso2.toString());
    }
}
