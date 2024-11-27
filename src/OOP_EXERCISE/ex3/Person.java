package OOP_EXERCISE.ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    String id;
    String hometown;
    Date DateOfBirth;

    Scanner scanner = new Scanner(System.in);

    Person(String id, String fullName, Date DateOfBirth) {
        this.id = id;
        this.hometown = hometown;
        this.DateOfBirth = DateOfBirth;
    }

    Person() {
    }

    void addPerson() {

        System.out.print("Enter your ID: ");
        id = scanner.nextLine();
        System.out.print("Enter your hometown: ");
        hometown = scanner.nextLine();
        System.out.print("Enter your date of birth: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            String inputDate = scanner.nextLine();
            try {
                DateOfBirth = dateFormat.parse(inputDate);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date. Please try again");
                System.out.print("Enter your date of birth: ");
            }
        }

    }

    void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String inputDate = dateFormat.format(DateOfBirth);
        System.out.println("ID: " + id);
        System.out.println("Hometown: " + hometown);
        System.out.println("Date of birth: " + inputDate);

    }

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    boolean editPerson(String idToFind) {
        return id.equals(idToFind);
    }
}
