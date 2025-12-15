package InheritanceProject.src.model.Student;

import InheritanceProject.src.model.CommunityMember;

public abstract class Student extends CommunityMember{
    protected double grade;
   
    public Student(String name, double grade) {
        super(name);
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }else{
            this.grade = grade;
        }
    }
    public abstract boolean isSuccessful();
    
}
