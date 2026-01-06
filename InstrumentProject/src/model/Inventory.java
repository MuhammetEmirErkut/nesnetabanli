package InstrumentProject.src.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price) {
        Instrument instrument = new Instrument(serialNumber, price);
        inventory.add(instrument);
    }

    public void addInstrument(Instrument instrument) {
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(Instrument searchInstrument) {
        List<Instrument> matchingInstruments = new LinkedList<>();
        for (Instrument instrument : inventory) {
            if (instrument.matches(searchInstrument)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
