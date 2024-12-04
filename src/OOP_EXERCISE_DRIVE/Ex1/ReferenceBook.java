package OOP_EXERCISE_DRIVE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    ReferenceBook() {

    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        setBookId(scanner.nextLine());
        System.out.print("Enter name of publisher: ");
        setPublisher(scanner.nextLine());
        System.out.print("Enter entry date: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        while (true) {
            String inputDate = scanner.nextLine();
            try {
                setEntryDate(dateFormat.parse(inputDate));
                break;
            } catch (ParseException e) {
                System.out.print("Invalid date. Please enter again: ");
            }
        }
        System.out.print("Enter quantity: ");
        setQuantity(scanner.nextDouble());
        System.out.print("Enter unit price: ");
        setUnitPrice(scanner.nextDouble());
        System.out.print("Enter the tax for this book: ");
        this.tax = scanner.nextDouble();

    }

    @Override
    public void updateBook(String id) {
        if (id.equals(getBookId())) {
            System.out.println("Update book with ID: " + id);
            addBook();
        } else {
            System.out.println("Cannot find book with ID: " + id);
        }

    }

    @Override
    public void displayBook() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Reference Book ID: " + getBookId() + ", publisher: " + getPublisher() + ", entry date: " + dateFormat.format(getEntryDate()) + ", quantity: " + getQuantity() + ", unit price: " + getUnitPrice() + ", tax: " + this.tax);
    }
}
