package OOP_EXERCISE_DRIVE.Ex8;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        BookList list = new BookList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("    ===MENU===  ");
            System.out.println("1.Add new textbook");
            System.out.println("2.Add new reference book");
            System.out.println("3.Display all books");
            System.out.println("4.Delete book by ID");
            System.out.println("5.Update book by ID");
            System.out.println("6.Find book by ID");
            System.out.println("7.Find most expensive book");
            System.out.println("8.Count the total number of TextBooks and ReferenceBooks");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Number of textbook: ");
                    int t = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < t; i++) {
                        System.out.println("Enter ID: ");
                        String id = scanner.nextLine();
                        System.out.println("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter the base price: ");
                        double basePrice = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter subject: ");
                        String subject = scanner.nextLine();
                        TextBook tb = new TextBook(subject, id, title, basePrice);
                        list.addBook(tb);

                        System.out.println("Add textbook successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Number of referencebook: ");
                    int r = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < r; i++) {
                    System.out.println("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter the base price: ");
                    double basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter publisher: ");
                    String publisher = scanner.nextLine();
                    ReferenceBook rb = new ReferenceBook(publisher, id, title, basePrice);
                    list.addBook(rb);
                    System.out.println("Add reference successfully.");
                    }
                    break;
                case 3:
                    list.displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter id to delete: ");
                    String idDelete = scanner.nextLine();
                    list.deleteBookByID(idDelete);
                    break;
                case 5:
                    System.out.print("Enter id to update: ");
                    String idUpdate = scanner.nextLine();
                    list.updateBookByID(idUpdate);
                    break;
                case 6:
                    System.out.print("Enter id to find: ");
                    String idFind = scanner.nextLine();
                    list.findBookByID(idFind);
                    break;
                case 7:
                       list.findMostExpensiveBook();
                       break;
                case 8:
                    list.countBook();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

    }
}
