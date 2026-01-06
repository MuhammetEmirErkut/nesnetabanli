package InstrumentProject.src.model;

import java.util.HashMap;
import java.util.Map;

public class Instrument {
    private String serialNumber;
    private double price;
    private Map<String, Object> properties;

    public Instrument(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.properties = new HashMap<>();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public void setProperty(String propertyName, Object value) {
        properties.put(propertyName, value);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public boolean matches(Instrument other) {
        if (other == null) {
            return false;
        }

        // Tüm property'leri karşılaştır
        for (String key : other.properties.keySet()) {
            Object otherValue = other.properties.get(key);
            Object thisValue = this.properties.get(key);

            // Eğer aranan enstrümanda bir property varsa ve eşleşmiyorsa false döner
            if (otherValue != null && !otherValue.equals(thisValue)) {
                return false;
            }
        }
        return true;
    }
}
