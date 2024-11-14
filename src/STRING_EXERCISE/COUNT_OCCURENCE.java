package STRING_EXERCISE;

import java.util.Scanner;

public class COUNT_OCCURENCE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String word = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char x = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("Count of '" + x + "' in the string: " + count);
    }
}
