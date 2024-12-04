package OOP_EXERCISE_DRIVE.Ex11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
            System.out.println("4.Find person by ID");
            System.out.println("5.Delete person by ID");
            System.out.println("6.Display all student and teacher");
            System.out.println("7.Find the top 3 students with the highest GPA.");
            System.out.println("8.Find the teacher with the highest income.");
            System.out.println("9. Find student having scholarship");
            System.out.println("10.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter number of student you want to add: ");
                    int numberStudent = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberStudent; i++) {
                        System.out.println("Enter student: "+(i+1));
                        System.out.println("Enter ID: ");
                        String id = scanner.nextLine();
                        System.out.println("Enter your name");
                        String name = scanner.nextLine();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        dateFormat.setLenient(false);
                        Date dateOfBirth;
                        while (true) {
                            System.out.println("Enter date of birth: ");
                            String inputDate = scanner.nextLine();
                            try {
                                dateOfBirth = dateFormat.parse(inputDate);
                                break;
                            } catch (ParseException e) {
                                System.out.println("Invalid date. Please try again.");
                            }
                        }
                        System.out.println("Enter your gpa: ");
                        double gpa = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter tution fee: ");
                        double tutionFee = scanner.nextDouble();
                        scanner.nextLine();
                        Student student = new Student(gpa, tutionFee, id, name, dateOfBirth);
                        list.addPerson(student);
                        System.out.println("Add student successfully");
                    }
                    break;
                case 2:
                    System.out.println("Enter number of teacher you want to add: ");
                    int numberTeacher = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberTeacher; i++) {
                        System.out.println("Enter student: "+(i+1));
                        System.out.println("Enter ID: ");
                        String id = scanner.nextLine();
                        System.out.println("Enter your name");
                        String name = scanner.nextLine();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        dateFormat.setLenient(false);
                        Date dateOfBirth;
                        while (true) {
                            System.out.println("Enter date of birth: ");
                            String inputDate = scanner.nextLine();
                            try {
                                dateOfBirth = dateFormat.parse(inputDate);
                                break;
                            } catch (ParseException e) {
                                System.out.println("Invalid date. Please try again.");
                            }
                        }
                        System.out.println("Enter your gpa: ");
                        int numberOfClasses = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter tution fee: ");
                        double baseSalary = scanner.nextDouble();
                        scanner.nextLine();
                        Teacher teacher = new Teacher(numberOfClasses, baseSalary, id, name, dateOfBirth);
                        list.addPerson(teacher);
                         System.out.println("Add teacher successfully");
                    }
                    break;
                case 3:
                    System.out.println("Enter id to update: ");
                    String idUpdate = scanner.nextLine();
                    list.updatePersonById(idUpdate);
                    break;
                case 4:
                    System.out.println("Enter id to find: ");
                    String idFind = scanner.nextLine();
                    list.findPersonWithID(idFind);
                    break;
                case 5:
                    System.out.println("Enter id to delete: ");
                    String idDelete = scanner.nextLine();
                    list.deletePersonByID(idDelete);
                    break;
                case 6:
                    list.displayAll();
                    break;
                case 7:
                    ArrayList<Student> top3Student = list.findTop3Student();
                    if(top3Student.isEmpty()) {
                        System.out.println("No student in this list");
                    } else {
                        for(Student student:top3Student) {
                            System.out.println("Student ID: "+student.getId()+" with GPA: "+student.getGpa());
                        }
                    }
                    list.findTop3Student();
                    break;
                case 8:
                    list.findTeacherWithHighestIncome();
                    break;
                case 9:
                    list.findStudentWithScholarship();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        } while (choice != 0);
    }
}
