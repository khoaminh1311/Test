package OOP_EXERCISE_DRIVE.Ex11;

import java.util.Date;

public class Teacher extends Person {

    int numberOfClasses;
    double baseSalary;

    public Teacher(int numberOfClasses, double baseSalary, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    public Teacher() {
    }

    @Override
    public double caluclateIncome() {
        return numberOfClasses * baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" + "numberOfClasses=" + numberOfClasses + ", baseSalary=" + baseSalary + '}';
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
