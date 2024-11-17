package OOP_EXERCISE;

import java.util.Scanner;

public class PROCESSOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        System.out.println("\n----- Student Management Menu -----");
        System.out.println("1. Enter student information");
        System.out.println("2. Display all students");
        System.out.println("3. Search student by ID");
        System.out.println("4. Delete student by ID");
        System.out.println("5. Edit student by ID");
        System.out.println("6. Exit");
        System.out.print("Please choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                studentList.addStudent();
                break;
            case 2:
                studentList.displayAllStudents();
                break;
            case 3:
                System.out.print("Enter the ID: ");
                String idToFind = scanner.nextLine();
                studentList.findStudentByID(idToFind);
                break;
            case 4:
                System.out.print("Enter the ID: ");
                String idToDelete = scanner.nextLine();
                studentList.deleteStudentById(idToDelete);
                break;
            case 5:
                System.out.print("Enter the ID: ");
                String idToEdit = scanner.nextLine();
                studentList.editStudentbyId(idToEdit);
                break;
            case 6:
                System.out.println("Exit the program");
                break;
            default:
                System.out.println("Invalid choice. Please try again");

        }
    }
}