package OOP_EXERCISE_DRIVE.Ex11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void addPerson(Person person) {
        personList.add(person);
    }

    boolean updatePersonById(String id) {
        for (Person person : personList) {
            if (id.equalsIgnoreCase(person.getId())) {
                System.out.println("Enter new id: ");
                String newID = scanner.nextLine();
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                person.setId(newID);
                person.setName(newName);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false);
                while (true) {
                    String inputDate = scanner.nextLine();
                    try {
                        person.setDateOfBirth(dateFormat.parse(inputDate));
                        break;
                    } catch (ParseException e) {
                        System.out.println("Invalid date. Please try again.");
                    }
                }
                if (person instanceof Student) {
                    System.out.println("Enter new GPA: ");
                    double newGPA = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter new tutionFee: ");
                    double newTutionFee = scanner.nextDouble();
                    scanner.nextLine();
                    ((Student) person).setGpa(newGPA);
                    ((Student) person).setTutionFee(newTutionFee);
                    System.out.println("Update student successfully");
                    return true;
                } else if (person instanceof Teacher) {
                    System.out.println("Enter new number of classes: ");
                    int newNumberOfClass = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new base salary: ");
                    double newBaseSalary = scanner.nextDouble();
                    scanner.nextLine();
                    ((Teacher) person).setBaseSalary(newNumberOfClass);
                    ((Teacher) person).setBaseSalary(newBaseSalary);
                    System.out.println("Update teacher succesfully");
                    return true;
                }
            }
        }
        System.out.println("Cannot find person with ID: " + id);
        return false;
    }

    boolean deletePersonByID(String id) {
        for (Person person : personList) {
            if (id.equalsIgnoreCase(person.getId())) {
                personList.remove(person);
                return true;
            }
        }
        System.out.println("Cannot find person with ID: " + id);
        return false;
    }

    Person findPersonWithID(String id) {
        for (Person person : personList) {
            if (id.equalsIgnoreCase(person.getId())) {
                person.displayDetails();
            }
        }
        System.out.println("Cannot find person with ID: " + id);
        return null;
    }

    void displayAll() {
        for (Person person : personList) {
            person.displayDetails();
        }
    }
    ArrayList<Student> findTop3Student() {
        ArrayList<Student> students = new ArrayList<>();
        Student top1 = null, top2 =null, top3 = null;
        for(Person person:personList) {
        if(person instanceof Student) {
            students.add((Student) person);
        }
    }
        for(Student student:students) {
            if(top1 == null|| student.getGpa()>top1.getGpa()) {
                top3 = top2;
                top2= top1; 
                top1= student;
            }
            else if(top2 == null||student.getGpa()>top2.getGpa()) {
                top3 = top2;
                top2= student;
            } else if(top3==null||student.getGpa()>top3.getGpa()) {
                top3 = student;
            }
        }
        ArrayList<Student> top3Student = new ArrayList<>();
        if(top1 != null) {
        top3Student.add(top1);
        }
        if(top2 != null) {
        top3Student.add(top2);
        }
        if(top3 != null) {
        top3Student.add(top3);
        }
        return top3Student;
    }
    Teacher findTeacherWithHighestIncome() {
        ArrayList<Teacher> teachers = new ArrayList<>();
         for(Person person:personList) {
             if(person instanceof Teacher) {
                 teachers.add((Teacher) person);
             }
         }
         double highestIncome = teachers.get(0).caluclateIncome();
         String idHighestIncome  = teachers.get(0).getId();
         for(Teacher teacher:teachers) {
             if(teacher.caluclateIncome()>highestIncome) {
                 highestIncome = teacher.caluclateIncome();
                 idHighestIncome = teacher.getId();
             }
         }
        System.out.println("Teacher with ID "+idHighestIncome+ " has highest income: "+highestIncome);
        return null;
    }
    ArrayList<Student> findStudentWithScholarship() {
        ArrayList<Student> students = new ArrayList<>();
        for(Person person:personList) {
             if(person instanceof Student) {
                 students.add((Student) person);
             }
         }
        for(Student student:students) {
            if(student.getGpa() > 3.5) {
                System.out.println("Student ID: "+student.getId()+" has a scholarship with GPA: "+student.getGpa());
            }
        }
        return null;
    }
}
