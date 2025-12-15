package GuitarProject.src.model;

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(model, builder, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
    @Override
    public boolean matches(InstrumentSpec other) {
        if (!super.matches(other)) {
            return false;
        }
        if (!(other instanceof GuitarSpec)) {
            return false;
        }
        GuitarSpec guitarSpec = (GuitarSpec) other;
        if (numStrings != guitarSpec.numStrings) {
            return false;
        }
        return true;
    }
}
