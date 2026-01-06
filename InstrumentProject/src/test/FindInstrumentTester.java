package InstrumentProject.src.test;

import java.util.List;

import InstrumentProject.src.model.Builder;
import InstrumentProject.src.model.Instrument;
import InstrumentProject.src.model.Inventory;
import InstrumentProject.src.model.Style;
import InstrumentProject.src.model.Type;
import InstrumentProject.src.model.Wood;

public class FindInstrumentTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Erin'in aradığı özellikler
        Instrument whatErinLikes = new Instrument("", 0);
        whatErinLikes.setProperty("builder", Builder.FENDER);
        whatErinLikes.setProperty("model", "Stratocaster");
        whatErinLikes.setProperty("type", Type.ELECTRIC);
        whatErinLikes.setProperty("backWood", Wood.ALDER);
        whatErinLikes.setProperty("topWood", Wood.ALDER);
        whatErinLikes.setProperty("numStrings", 6);

        List<Instrument> matchingInstruments = inventory.search(whatErinLikes);
        if (matchingInstruments.size() > 0) {
            System.out.println("Erin, you might like these instruments:");
            for (Instrument instrument : matchingInstruments) {
                System.out.println(instrument.getProperty("builder") + " " + 
                                 instrument.getProperty("model") + " " + 
                                 instrument.getProperty("type") + " instrument:\n    " + 
                                 instrument.getProperty("backWood") + " back and sides,\n    " + 
                                 instrument.getProperty("topWood") + " top.\n  You can have it only for $" + 
                                 instrument.getPrice() + "!\n");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Guitar 1
        Instrument guitar1 = new Instrument("V95693", 1499.95);
        guitar1.setProperty("builder", Builder.FENDER);
        guitar1.setProperty("model", "Stratocaster");
        guitar1.setProperty("type", Type.ELECTRIC);
        guitar1.setProperty("backWood", Wood.ALDER);
        guitar1.setProperty("topWood", Wood.ALDER);
        guitar1.setProperty("numStrings", 6);
        inventory.addInstrument(guitar1);

        // Guitar 2
        Instrument guitar2 = new Instrument("V9512", 1549.95);
        guitar2.setProperty("builder", Builder.FENDER);
        guitar2.setProperty("model", "Stratocaster");
        guitar2.setProperty("type", Type.ELECTRIC);
        guitar2.setProperty("backWood", Wood.ALDER);
        guitar2.setProperty("topWood", Wood.MAPLE);
        guitar2.setProperty("numStrings", 6);
        inventory.addInstrument(guitar2);

        // Guitar 3
        Instrument guitar3 = new Instrument("122784", 5495.95);
        guitar3.setProperty("builder", Builder.MARTIN);
        guitar3.setProperty("model", "D-18");
        guitar3.setProperty("type", Type.ACOUSTIC);
        guitar3.setProperty("backWood", Wood.MAHOGANY);
        guitar3.setProperty("topWood", Wood.ADIRONDACK);
        guitar3.setProperty("numStrings", 6);
        inventory.addInstrument(guitar3);

        // Guitar 4
        Instrument guitar4 = new Instrument("76531", 6295.95);
        guitar4.setProperty("builder", Builder.MARTIN);
        guitar4.setProperty("model", "OM-28");
        guitar4.setProperty("type", Type.ACOUSTIC);
        guitar4.setProperty("backWood", Wood.BRAZILIAN_ROSEWOOD);
        guitar4.setProperty("topWood", Wood.CEDAR);
        guitar4.setProperty("numStrings", 6);
        inventory.addInstrument(guitar4);

        // Guitar 5
        Instrument guitar5 = new Instrument("70108276", 2295.95);
        guitar5.setProperty("builder", Builder.MARTIN);
        guitar5.setProperty("model", "OM-45");
        guitar5.setProperty("type", Type.ACOUSTIC);
        guitar5.setProperty("backWood", Wood.BRAZILIAN_ROSEWOOD);
        guitar5.setProperty("topWood", Wood.CEDAR);
        guitar5.setProperty("numStrings", 6);
        inventory.addInstrument(guitar5);

        // Mandolin
        Instrument mandolin = new Instrument("70108277", 2295.95);
        mandolin.setProperty("builder", Builder.GIBSON);
        mandolin.setProperty("model", "Flying V");
        mandolin.setProperty("type", Type.ELECTRIC);
        mandolin.setProperty("backWood", Wood.ALDER);
        mandolin.setProperty("topWood", Wood.ALDER);
        mandolin.setProperty("style", Style.F);
        inventory.addInstrument(mandolin);
    }
}
