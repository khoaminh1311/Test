
package OOP_EXERCISE_DRIVE.Ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Room> roomList = new ArrayList<>();
    void addRoom(Room room) {
        roomList.add(room);
    }
    boolean updateRoomByID(String id) {
       for(Room room:roomList) {
           if(id.equalsIgnoreCase(room.getId())) {
               System.out.println("Enter new ID: ");
               String newId = scanner.nextLine();
               System.out.println("Enter new name: ");
               String newName = scanner.nextLine();
               System.out.println("Enter new base cost: ");
               double newBaseCost = scanner.nextDouble();
               scanner.nextLine();
               room.setId(newId);
               room.setName(newName);
               room.setBaseCost(newBaseCost);
               if(room instanceof MeetingRoom) {
                   System.out.println("Enter new capacity: ");
                   int newCapacity = scanner.nextInt();
                   ((MeetingRoom) room).setCapacity(newCapacity);
               } else if(room instanceof BedRoom) {
                   System.out.println("Enter new numbers of beds: ");
                   int newNumberOfBeds = scanner.nextInt();
                   ((BedRoom) room).setNumberOfBeds(newNumberOfBeds);
               }
               System.out.println("Update succesfully.");
               return true;
           }
       }
        System.out.println("Cannot find room with id: "+id);
        return false;
    }
    boolean deleteRoomByID(String id) {
        for(Room room:roomList) {
            if(id.equalsIgnoreCase(room.getId())) {
                System.out.println("Find room with id "+id+". Deleting...");
                roomList.remove(room);
                return true;
            }
        }
        System.out.println("Cannot find room with id: "+id);
        return false;
    }
    Room findRoomByID(String id) {
        for(Room room:roomList) {
            if(id.equalsIgnoreCase(room.getId())) {
                room.displayDetails();
                
            }
    }
        return null;
}
    void displayAllRooms() {
        for(Room room:roomList) {
            room.displayDetails();
        }
    }
    Room findMostExpensiveRoom() {
        Room max = roomList.get(0);
        for(Room room:roomList) {
            if(max.calculateCost() < room.calculateCost()) {
                max = room;
            }
        }
        System.out.println("Room "+max.getId()+" is the most expensive room with price "+max.calculateCost());
        return max;
    }
    void countRoom() {
        int mrCount  = 0;
        int brCount = 0;
        for(Room room:roomList) {
            if(room instanceof MeetingRoom) {
                mrCount++;
            } else if(room instanceof BedRoom) {
                brCount++;
            }
        }
        System.out.println("Meeting room: "+mrCount);
        System.out.println("Bed room: "+brCount);
    }
}
