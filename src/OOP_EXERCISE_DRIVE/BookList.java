
package OOP_EXERCISE_DRIVE;

import java.util.ArrayList;

public class BookList {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book book) {
//        book.addBook();
        books.add(book);
        System.out.println("Add book successfully");
    }
    void displayAll() {
        if(books.isEmpty()) {
            System.out.println("No book in the list");
        }
        for(Book book:books) {
            book.displayBook();
        }
    }
    void updateBook(String id) {
        for(Book book:books) {
            if(id.equals(book.getBookId())) {
                book.addBook();
                System.out.println("Update successfully");
            }
        }
        System.out.println("Can not find the book with ID: "+id);
    }
    void deleteBookByID(String id) {        
        for(Book book:books) {
            if(id.equals(book.getBookId())) {
                books.remove(book);
                System.out.println("Delete book with ID: "+id+" succesfully");
                return;
            }
        }
        System.out.println("Can not find the book with ID: "+id);
    }
    void findBookByID(String id) {
        for(Book book:books) {
            if(id.equals(book.getBookId())) {
                System.out.println("Find a book with ID: "+id);
                book.displayBook();
                return;
            }
        }
        System.out.println("Can not find the book with ID: "+id);
    }
}
