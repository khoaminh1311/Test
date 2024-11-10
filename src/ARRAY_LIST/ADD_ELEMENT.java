/*
Create and Add Elements to ArrayList

Create an ArrayList to store the names of friends. Add 5 names to the list and print the list.
*/
package test.ARRAY_LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class ADD_ELEMENT {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 5 friends's name: ");
        for(int i = 0; i < 5;i++) {
            System.out.print("Friend "+ (i+1)+": ");
            String name = scanner.nextLine();
            names.add(name);
        }
for(String name:names) {
    System.out.println(name);
}
    }
}
