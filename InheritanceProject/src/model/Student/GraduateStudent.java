package InheritanceProject.src.model.Student;

public class GraduateStudent extends Student {
    public enum Type {
        MASTERS_STUDENT, DOCTORAL_STUDENT
    }
    
    private Type type;
    
    public GraduateStudent(String name, double grade) {
        super(name, grade);
        this.type = determineType(grade);
    }
    
    private Type determineType(double grade) {
        if (grade >= 90) {
            return Type.DOCTORAL_STUDENT;
        } else if (grade >= 85) {
            return Type.MASTERS_STUDENT;
        } else {
            throw new IllegalArgumentException("Grade must be at least 85 for graduate student");
        }
    }
    
    @Override
    public boolean isSuccessful() {
        // Graduate students are successful if grade >= 85
        return grade >= 85;
    }
    
    public Type getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "GraduateStudent{name='" + name + "', grade=" + grade + ", type=" + type + "}";
    }
}
