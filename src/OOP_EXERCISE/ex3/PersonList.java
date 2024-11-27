
package OOP_EXERCISE.ex3;

import java.util.ArrayList;

public class PersonList {
       ArrayList<Person> people = new ArrayList<>();
         
    void addPerson(Person person) {
       people.add(person);
    }
    void deletePersonById(String idToDelete) {
        for(Person person:people) {
            if(person.getID().equals(idToDelete)) {
                people.remove(person);
            }
        }
    }
    void editPersonById(String idToEdit) {
        for(Person person:people) {
            if(person.editPerson(idToEdit) == true) {
                System.out.println("Edit information for student with ID: "+idToEdit);
                person.addPerson();
                System.out.println("Edit successfully");
                return;
            }
        }
    }    
    void displayAll() {
        for(Person person:people) {
            person.displayInfo();
        }
    }
    }
