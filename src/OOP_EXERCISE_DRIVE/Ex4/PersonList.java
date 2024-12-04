package OOP_EXERCISE_DRIVE.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();

    void addPerson(Person person) {
        personList.add(person);
    }

    void updatePerson(String id) {
        for (Person p : personList) {
            p.updatePerson(id);
        }
    }

    void deletePersonById(String id) {
        for (Person p : personList) {
            if (id.equals(p.getId())) {
                personList.remove(p);
                return;
            }
        }
        System.out.println("Cannot find person with ID: " + id);
    }

    void findPersonById(String id) {
        for (Person p : personList) {
            if (id.equals(p.getId())) {
                System.out.println("Find person with ID: " + id);
                p.displayInfo();
                return;
            }
        }
        System.out.println("Cannot find person with ID: " + id);
    }

    void displayEveryone() {
        if (personList.isEmpty()) {
            System.out.println("No person in the list.");
        }
        for (Person p : personList) {
            p.displayInfo();
        }
    }

    Student findTopStudent() {
        ArrayList<Student> students = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }
//        float highestGPA = students.get(0).gpa;
//        String highestId = students.get(0).id;
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.gpa > topStudent.gpa) {
                topStudent = student;
            }
        }
        System.out.println("Student with ID " + topStudent.id + "has highest GPA: " + topStudent.gpa);
        return topStudent;
    }

    Teacher findTeacherByDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department you want to find: ");
        String departmentFind = scanner.nextLine();
        ArrayList<Teacher> teachersInDepartment = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Teacher) {
                Teacher teacher = (Teacher) p;
                if (teacher.department.equalsIgnoreCase(departmentFind)) {
                    teachersInDepartment.add(teacher);
                }
            }
        }
        if (teachersInDepartment.isEmpty()) {
            System.out.println("No teacher in this department");
        } else {
            System.out.println("Found teacher in this department: ");
            for (Teacher teacher : teachersInDepartment) {
                teacher.displayInfo();
            }
        }
        return null;
    }

    void checkBookBorrowing() {
        for (Person p : personList) {
            if (p.isBookOverdue()) {
                System.out.println("Overdue");
            } else {
                System.out.println("Not overdue");
            }
        }
    }
}
