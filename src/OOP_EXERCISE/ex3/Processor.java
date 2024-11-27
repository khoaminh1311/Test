
package OOP_EXERCISE.ex3;

import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList list = new PersonList();
        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Students");
            System.out.println("2. Add Teachers");
            System.out.println("3. Display All");
            System.out.println("4. Delete Person By ID");
            System.out.println("5. Edit Person By ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter the number of students you want to add: ");
                    int studentCount = scanner.nextInt();
                    scanner.nextLine();
                    for(int i = 0; i < studentCount; i++) {
//                       list.addPerson(new Student("","",new Date()));
                         Student student = new Student();
                         student.addPerson();
                         list.addPerson(student);
                    }
                    System.out.println("Add student succesfully");
                    break;
                case 2:
                    System.out.println("Enter the number of teachers you want to add: ");
                    int teacherCount = scanner.nextInt();
                    scanner.nextLine();
                    for(int i = 0; i < teacherCount; i++) {
//                       list.addPerson(new Teacher("","",new Date()));
                         Teacher teacher = new Teacher();
                         teacher.addPerson();
                         list.addPerson(teacher);
                    }
                    System.out.println("Add teacher succesfully");
                    break;
                case 3:
                    System.out.println("Display all person:");
                    list.displayAll();
                    break;
                case 4:
                    System.out.println("Enter ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    list.deletePersonById(idToDelete);
                    break;
                case 5:
                    System.out.println("Enter ID to edit:");
                    String idToEdit = scanner.nextLine();
                    list.editPersonById(idToEdit);
                    break;
                case 6:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while(choice !=0);
    }
}
