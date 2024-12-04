
package OOP_EXERCISE_DRIVE.Ex4;

import java.util.Date;

public abstract class Person implements IPerson {
    String id,fullName;
    Date dateOfBirth,bookBorrowDate,bookReturnDate;
    Person() {      
    }
    @Override
    public abstract void addPerson();
    @Override
    public abstract void displayInfo();
    @Override
    public abstract void updatePerson(String id);
    public abstract boolean isBookOverdue();
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
        
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }
    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }
    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    } public Date getBookReturnDate() {
        return bookReturnDate;
    }
}
