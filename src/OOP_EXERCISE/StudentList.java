package OOP_EXERCISE;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentList {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();

    void addStudent() {
        System.out.println("Enter the number of student you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            Student student = new Student("", "", new Date(), "", 0.0f);
            student.enterStudentInfo();
            list.add(student);
            System.out.println("Student added successfully");
        }
    }

    void displayAllStudents() {
        for (Student student : list) {
            student.displayStudentInfo();
        }
    }

    Student findStudentByID(String idToFind) {
        for (Student student : list) {
            if (student.toString().equals(idToFind)) {
                student.displayStudentInfo();
            }
        }
        System.out.println("No student found with ID: " + idToFind);
        return null;
    }

    boolean deleteStudentById(String idToDelete) {
        for (Student student : list) {
            if (student.id.equals(idToDelete)) {
                list.remove(student);
            }
        }
        System.out.println("No student found with ID: " + idToDelete);
        return false;
    }

    boolean editStudentbyId(String idToEdit) {
        for (Student student : list) {
            if (student.id.equals(idToEdit)) {
                System.out.println("Found student. Enter new information: ");
                student.enterStudentInfo();
            }
        }
        System.out.println("No student found with ID: " + idToEdit);
        return false;
    }
}
