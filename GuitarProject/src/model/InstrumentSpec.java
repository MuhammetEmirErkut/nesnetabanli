package GuitarProject.src.model;

public abstract class InstrumentSpec {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    public InstrumentSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public String getModel() {
        return model;
    }
    public Builder getBuilder() {
        return builder;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
    public boolean matches(InstrumentSpec other) {
        if (other == null) {
            return false;
        }
        if (builder != other.builder) {
            return false;
        }
        if ((model != null && !model.equals(other.model)) || (model == null && other.model != null)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        if (backWood != other.backWood) {
            return false;
        }
        if (topWood != other.topWood) {
            return false;
        }
        return true;
    }
}
