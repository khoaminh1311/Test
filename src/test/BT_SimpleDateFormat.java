package test;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class BT_SimpleDateFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        System.out.print("Enter your date of birth(dd/MM/yyyy): ");
        String date = scanner.nextLine();
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            System.out.println("Date of birth: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }

        scanner.close();
    }
}
