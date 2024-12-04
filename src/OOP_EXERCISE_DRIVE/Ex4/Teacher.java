package OOP_EXERCISE_DRIVE.Ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Teacher extends Person {

    String department, teachingSubject;

    Teacher() {

    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addPerson() {
        System.out.print("Enter ID: ");
        setId(scanner.nextLine());
        System.out.println("Enter full name: ");
        setFullName(scanner.nextLine());
        System.out.println("Enter date of birth: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            System.out.println("Enter date of birth: ");
            String dOB = scanner.nextLine();
            System.out.println("Enter borrow date: ");
            String borrowDate = scanner.nextLine();
            System.out.println("Enter return date: ");
            String returnDate = scanner.nextLine();
            try {
                setDateOfBirth(dateFormat.parse(dOB));
                setBookBorrowDate(dateFormat.parse(borrowDate));
                setBookReturnDate(dateFormat.parse(returnDate));
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date. Try again");
            }
        }
        System.out.println("Enter department: ");
        department = scanner.nextLine();
        System.out.println("Enter subject: ");
        teachingSubject = scanner.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        if (id.equals(getId())) {
            System.out.println("Update Person with ID: " + id);
            addPerson();
        } else {
            System.out.println("Cannot find person with ID: " + id);
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Display Teacher Info: ");
        System.out.println("ID: " + getId() + "; Full name: " + getFullName() + "; Date of birth: " + dateFormat.format(getDateOfBirth()) + "; Book borrow date: " + dateFormat.format(getBookBorrowDate()) + "; Book Return Date: " + dateFormat.format(getBookReturnDate()) + "; department: " + this.department + "; subject: " + this.teachingSubject);
    }

    @Override
    public boolean isBookOverdue() {
       long milisec = getBookReturnDate().getTime() - getBookBorrowDate().getTime();
       long days = milisec / (1000*60*60*24);
       if(days >= 30) {
           return true;
       } else {
           return false;
       }
    }
}
