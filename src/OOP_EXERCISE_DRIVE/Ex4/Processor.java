package OOP_EXERCISE_DRIVE.Ex4;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList list = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("    ===MENU===  ");
            System.out.println("1.Add new student");
            System.out.println("2.Add new teacher");
            System.out.println("3.Update person by ID");
            System.out.println("4.Delete person by ID");
            System.out.println("5.Display all student and teacher");
            System.out.println("6.Find the student with highest GPA");
            System.out.println("7.Find teacher by department");
            System.out.println("8.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("How many student to add? ");
                    int studentCount = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < studentCount; i++) {
                        Student student = new Student();
                        student.addPerson();
                        list.addPerson(student);
                        System.out.println("Add student successfully");
                    }
                    break;
                case 2:
                    System.out.print("How many teacher to add? ");
                    int teacherCount = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < teacherCount; i++) {
                        Teacher teacher = new Teacher();
                        teacher.addPerson();
                        list.addPerson(teacher);
                        System.out.println("Add teacher successfully");
                    }
                    break;
                case 3:
                    System.out.println("Enter ID of person to edit: ");
                    String idEdit = scanner.nextLine();
                    list.updatePerson(idEdit);
                    break;
                case 4:
                    System.out.println("Enter ID of person to delete: ");
                    String idDelete = scanner.nextLine();
                    list.deletePersonById(idDelete);
                    break;
                case 5:
                    System.out.println("Display all people: ");
                    list.displayEveryone();
                    break;
                case 6:
                    list.findTopStudent();
                    break;
                case 7:
                    list.findTeacherByDepartment();
                    break;
                case 8:
                    list.checkBookBorrowing();
                    break;
                case 9:
                     System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again: ");
            }
        } while (choice != 0);
    }
}
