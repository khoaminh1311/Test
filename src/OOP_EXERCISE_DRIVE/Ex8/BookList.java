package OOP_EXERCISE_DRIVE.Ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    ArrayList<Book> bookList;
    Scanner scanner = new Scanner(System.in);

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    void addBook(Book book) {
        bookList.add(book);
    }

    void updateBookByID(String id) {
        for (Book book : bookList) {
            if (book.getId().equalsIgnoreCase(id)) {
                System.out.println("Enter ID: ");
                String idNew = scanner.nextLine();
                System.out.println("Enter title: ");
                String titleNew = scanner.nextLine();
                System.out.println("Enter the base price: ");
                double basePriceNew = scanner.nextDouble();
                scanner.nextLine();
                if (book instanceof TextBook) {
                    System.out.println("Enter subject: ");
                    String subjectNew = scanner.nextLine();
                    book.setId(idNew);
                    book.setTitle(titleNew);
                    book.setBasePrice(basePriceNew);
                    ((TextBook) book).setSubject(subjectNew);
                } else if (book instanceof ReferenceBook) {
                    System.out.println("Enter publisher: ");
                    String publisherNew = scanner.nextLine();
                    book.setId(idNew);
                    book.setTitle(titleNew);
                    book.setBasePrice(basePriceNew);
                    ((ReferenceBook) book).setPublisher(publisherNew);
                }
                System.out.println("Updated book succesfully");
                return;
            }
        }
        System.out.println("Cannot found book with ID: " + id);
    }

    void deleteBookByID(String id) {
        for (Book book : bookList) {
            if (book.getId().equalsIgnoreCase(id)) {
                bookList.remove(book);
                return;
            }
        }
        System.out.println("Cannot found book with ID: " + id);
    }

    void findBookByID(String id) {
        for (Book book : bookList) {
            if (book.getId().equalsIgnoreCase(id)) {
                book.displayDetails();
                return;
            }
        }
        System.out.println("Cannot found book with ID: " + id);
    }

    void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No book in the list.");
        }
        for (Book book : bookList) {
            book.displayDetails();
        }
    }

    Book findMostExpensiveBook() {
        double max = bookList.get(0).calculatePrice();
        String idMax = bookList.get(0).getId();
        for (Book book : bookList) {
            if (book.calculatePrice() > max) {
                max = book.calculatePrice();
                idMax = book.getId();
            }
        }
        System.out.println("Book with ID" + idMax + " has the most expensive price: " + max);
        return null;
    }

    void countBook() {
        int tbCount = 0;
        int rbCount = 0;
        for (Book book : bookList) {
            if (book instanceof TextBook) {
                tbCount++;
            } else if (book instanceof ReferenceBook) {
                rbCount++;
            }
        }
        System.out.println("Textbook: " + tbCount);
        System.out.println("Reference book: " + rbCount);
    }
}
