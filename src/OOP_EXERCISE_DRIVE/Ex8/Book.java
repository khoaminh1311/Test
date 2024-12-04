
package OOP_EXERCISE_DRIVE.Ex8;

public abstract class Book implements IBook {
    private String id,title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public Book() {
    }
    @Override
    public  abstract double calculatePrice();
    @Override
    public  void displayDetails() {
        System.out.print("ID: " + getId() + "; Title: " + getTitle() + "; basePrice: " + calculatePrice()+" ");
    };
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
}
