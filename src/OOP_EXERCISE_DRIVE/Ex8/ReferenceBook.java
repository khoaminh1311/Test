package OOP_EXERCISE_DRIVE.Ex8;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }
    
    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() * 0.2;
    }

    @Override
    public void displayDetails() {
        System.out.println("Display Reference book: ");
        super.displayDetails();
        System.out.println("publisher: " + this.publisher);
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
