package STRING_EXERCISE;

import java.util.Scanner;

public class REMOVE_SPACE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        String output = input.trim();
        System.out.println(output);
    }
}
