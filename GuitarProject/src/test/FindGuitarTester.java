package GuitarProject.src.test;

import java.util.List;

import GuitarProject.src.model.Instrument;

import GuitarProject.src.model.Builder;
import GuitarProject.src.model.GuitarSpec;
import GuitarProject.src.model.Inventory;
import GuitarProject.src.model.MandolinSpec;
import GuitarProject.src.model.Style;
import GuitarProject.src.model.Type;
import GuitarProject.src.model.Wood;
import GuitarProject.src.model.InstrumentSpec;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        InstrumentSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
        List<Instrument> matchingInstruments = inventory.search(whatErinLikes);
        if (matchingInstruments.size() > 0) {
            System.out.println("Erin, you might like these instruments:");
            for (Instrument instrument : matchingInstruments) {
                System.out.println(instrument.getSpec().getBuilder() + " " + instrument.getSpec().getModel() + " " + instrument.getSpec().getType() + " instrument:\n    " + instrument.getSpec().getBackWood() + " back and sides,\n    " + instrument.getSpec().getTopWood() + " top.\n  You can have it only for $" + instrument.getPrice() + "!\n");
            }
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("122784", 5495.95, new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK, 6));
        inventory.addInstrument("76531", 6295.95, new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR, 6));
        inventory.addInstrument("70108276", 2295.95, new GuitarSpec(Builder.MARTIN, "OM-45", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR, 6));
        inventory.addInstrument("70108276", 2295.95, new GuitarSpec(Builder.MARTIN, "OM-45", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR, 6)); 
        inventory.addInstrument("70108276", 2295.95, new MandolinSpec(Builder.GIBSON, "Flying V", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F));
    }
}
