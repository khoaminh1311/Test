package STRING_EXERCISE;

import java.util.Scanner;

public class REVERSE_STRING {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String word = scanner.nextLine();
        StringBuffer sb = new StringBuffer(word);
        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}
