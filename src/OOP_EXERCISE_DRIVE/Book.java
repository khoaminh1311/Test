package OOP_EXERCISE_DRIVE;

import java.util.Date;

public abstract class Book implements IBook {

    private String bookID, publisher;
    private Date entryDate;
    private double unitPrice, quantity;

    @Override
    public abstract void addBook();

    @Override
    public abstract void updateBook(String id);

    @Override
    public abstract void displayBook();

    public String getBookId() {
        return bookID;
    }

    public void setBookId(String bookID) {
      this.bookID = bookID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
