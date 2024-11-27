
package OOP_EXERCISE.ex3;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    String department;
    public Teacher(String id,String hometown, Date dateOfBirth) {
        super(id,hometown,dateOfBirth);
        this.department = department;
    }
    Teacher() {
        
    }
    @Override
    void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Teacher Info: ");
        super.addPerson();
        System.out.print("Enter your department: ");
        department = scanner.nextLine();
    }

    @Override
    void displayInfo() {
        
        System.out.println("Display Teacher Info: ");
        super.displayInfo();
        System.out.println("Department: "+department);
    }
   @Override
   boolean editPerson(String idToFind) {
       return super.editPerson(id);
   }
}
