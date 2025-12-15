package GuitarProject.src.model;

public class MandolinSpec extends InstrumentSpec {
    private Style style;
    
    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(model, builder, type, backWood, topWood);
        this.style = style;
    }
    public Style getStyle() {
        return style;
    }
    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec)) {
            return false;
        }
        if(!(otherSpec instanceof MandolinSpec)) {
            return false;
        }
        MandolinSpec other = (MandolinSpec) otherSpec;
        if(style != other.style) {
            return false;
        }
        return true;
    }
}
