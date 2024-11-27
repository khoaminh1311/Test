
package OOP_EXERCISE.ex3;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    String major;
    public Student(String id,String hometown, Date dateOfBirth) {
        super(id,hometown,dateOfBirth);
        this.major = major;
    }
Student() {
    
}
    @Override
    void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Student Info: ");
        super.addPerson();
        System.out.print("Enter your major: ");
        major = scanner.nextLine();
    }

    @Override
    void displayInfo() {
        
        System.out.println("Display Student Info: ");
        super.displayInfo();
        System.out.println("Major: "+major);
    }
  @Override
   boolean editPerson(String idToFind) {
       return super.editPerson(id);
   }
}
