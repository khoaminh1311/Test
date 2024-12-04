package OOP_EXERCISE_DRIVE.Ex8;

public class TextBook extends Book {

    String subject;

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() * 0.1;
    }

    @Override
    public void displayDetails() {
        System.out.println("Display Text book: ");
        super.displayDetails();
        System.out.println("publisher: " + this.subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
