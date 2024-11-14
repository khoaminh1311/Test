package STRING_EXERCISE;

import java.util.Scanner;

public class PALINDROME2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + input.charAt(i);
        }
        if (input.equalsIgnoreCase(reversedInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
