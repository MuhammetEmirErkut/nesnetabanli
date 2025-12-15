package InheritanceProject.src.model.Student;

public class UnderGraduateStudent extends Student {
    public enum Level {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }
    
    private Level level;
    
    public UnderGraduateStudent(String name, double grade) {
        super(name, grade);
        this.level = determineLevel(grade);
    }
    
    private Level determineLevel(double grade) {
        if (grade >= 80) {
            return Level.SENIOR;
        } else if (grade >= 75) {
            return Level.JUNIOR;
        } else if (grade >= 65) {
            return Level.SOPHOMORE;
        } else if (grade >= 60) {
            return Level.FRESHMAN;
        } else {
            throw new IllegalArgumentException("Grade must be at least 60 for undergraduate student");
        }
    }
    
    @Override
    public boolean isSuccessful() {
        // Undergraduate students are successful if grade >= 60
        return grade >= 60;
    }
    
    public Level getLevel() {
        return level;
    }
    
    @Override
    public String toString() {
        return "UnderGraduateStudent{name='" + name + "', grade=" + grade + ", level=" + level + "}";
    }
}
