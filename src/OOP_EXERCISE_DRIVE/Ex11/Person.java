
package OOP_EXERCISE_DRIVE.Ex11;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person implements IPerson{
    private String id,name;
    private Date dateOfBirth;

    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Person{" + "id=" + id + ", name=" + name + ", dateOfBirth=" + dateFormat.format(dateOfBirth) + '}';
    }
     @Override
    public void displayDetails() {
        System.out.print(toString());
    }

}
