package OOP_EXERCISE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String id;
    String fullName;
    Date DateOfBirth;
    String major;
    float gpa;

    Student(String id, String fullName, Date DateOfBirth, String major, float gpa) {
        this.id = id;
        this.fullName = fullName;
        this.gpa = gpa;
        this.DateOfBirth = DateOfBirth;
        this.major = major;
    }

    void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        id = scanner.nextLine();
        System.out.print("Enter your full name: ");
        fullName = scanner.nextLine();
        System.out.print("Enter your date of birth: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            String inputDate = scanner.nextLine();
            try {
                dateFormat.parse(inputDate);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date. Please try again");
                System.out.print("Enter your date of birth: ");
            }
        }
        System.out.print("Enter your major: ");
        major = scanner.nextLine();
        System.out.print("Enter your gpa: ");
        gpa = scanner.nextFloat();

    }

    void displayStudentInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String inputDate = dateFormat.format(DateOfBirth);
        System.out.println("ID: " + this.id);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Date of birth: " + inputDate);
        System.out.println("Major: " + this.major);
        System.out.println("GPA: " + this.gpa);

    }
}
