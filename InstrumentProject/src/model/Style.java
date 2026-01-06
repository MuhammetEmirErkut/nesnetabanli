package InstrumentProject.src.model;

public enum Style {
    A, F;

    public String toString() {
        switch (this) {
            case A:
                return "A Style";
            case F:
                return "F Style";
            default:
                return "unknown";
        }
    }
}
