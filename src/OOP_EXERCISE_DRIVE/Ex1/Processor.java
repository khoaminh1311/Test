
package OOP_EXERCISE_DRIVE;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        BookList list = new BookList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add new book");
            System.out.println("2. Find book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Update book by id");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("How nany book you want to add? ");
                    int bookCount = scanner.nextInt();
                    scanner.nextLine();
                    for(int i = 0 ; i< bookCount; i++) {                   
                    System.out.print("Choose type of book: 1. TextBook ; 2. ReferenceBook: ");
                    int type = scanner.nextInt();
                    if(type == 1) {
                       TextBook tbook = new TextBook();
                       tbook.addBook();
                       list.addBook(tbook);
                        System.out.println("Add text book succesfully");
                    } else if(type == 2) {
                        ReferenceBook rbook = new ReferenceBook();
                       rbook.addBook();
                       list.addBook(rbook);
                        System.out.println("Add reference book succesfully");
                    } else {
                        System.out.println("Invalid choice.");
                    }
            }
                    break;
                case 2:
                    System.out.print("Enter ID to find: ");
                    String idToFind = scanner.nextLine();
                    list.findBookByID(idToFind);
                    break;
                case 3:
                    System.out.print("Enter ID to  delete:");
                    String idToDelete = scanner.nextLine();
                    list.deleteBookByID(idToDelete);
                    break;
                case 4:
                    System.out.println("Enter ID to update");
                    String idToUpdate = scanner.nextLine();
                    list.updateBook(idToUpdate);
                    break;
                case 5:
                   System.out.println("\nDisplaying all books:");
                   list.displayAll();
                   break;
                case 6:
                    System.out.println("Exiting...");
                    break;
        } 
    } while (choice !=0); 
}
}
