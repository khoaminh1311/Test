package OOP_EXERCISE_DRIVE.Ex9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        RoomList list = new RoomList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("    ===MENU===  ");
            System.out.println("1. Add a meeting room");
            System.out.println("2. Add a new bedroom");
            System.out.println("3. Update room by id");
            System.out.println("4. Delete room by id");
            System.out.println("5. Find room by id");
            System.out.println("6. Display all rooms");
            System.out.println("7. Fing the most expensive room");
            System.out.println("8. Count the number of meeting room and bedroom");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("How many meeting room you want to add?- ");
                    int numberMeetingRoom = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberMeetingRoom; i++) {
                        System.out.println("Enter  ID: ");
                        String id = scanner.nextLine();
                        System.out.println("Enter  name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter  base cost: ");
                        double baseCost = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter  capacity: ");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();
                        MeetingRoom mr = new MeetingRoom(capacity, id, name, baseCost);
                        list.addRoom(mr);
                    }
                    break;
                case 2:
                    System.out.print("How many bed room you want to add?- ");
                    int numberBedRoom = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberBedRoom; i++) {
                        System.out.println("Enter  ID: ");
                        String id = scanner.nextLine();
                        System.out.println("Enter  name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter  base cost: ");
                        double baseCost = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter number of beds: ");
                        int numberOfBeds = scanner.nextInt();
                        scanner.nextLine();
                        BedRoom br = new BedRoom(numberOfBeds, id, name, baseCost);
                        list.addRoom(br);
                    }
                    break;
                case 3:
                    System.out.println("Enter id to update: ");
                    String idUpdate = scanner.nextLine();
                    list.updateRoomByID(idUpdate);
                    break;
                case 4:
                    System.out.println("Enter id to delete: ");
                    String idDelete = scanner.nextLine();
                    list.deleteRoomByID(idDelete);
                    break;
                case 5:
                    System.out.println("Enter id to find: ");
                    String idFind = scanner.nextLine();
                    list.findRoomByID(idFind);
                    break;
                case 6:
                    list.displayAllRooms();
                    break;
                case 7:
                    list.findMostExpensiveRoom();
                    break;
                case 8:
                    list.countRoom();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Enter again.");

            }

        } while (choice != 0);
    }
}
