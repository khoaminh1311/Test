package OOP_EXERCISE_DRIVE.Ex11;

import java.util.Date;

public class Student extends Person {

    private double gpa, tutionFee;

    public Student(double gpa, double tutionFee, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tutionFee = tutionFee;
    }

    public Student() {
    }

    @Override
    public double caluclateIncome() {
        if (gpa > 3.5) {
            return tutionFee * 0.5;
        } else {
            return tutionFee;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Student{" + "gpa=" + gpa + ", tutionFee=" + tutionFee + '}';
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTutionFee() {
        return tutionFee;
    }

    public void setTutionFee(double tutionFee) {
        this.tutionFee = tutionFee;
    }

}
