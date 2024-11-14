package STRING_EXERCISE;

import java.util.Scanner;

public class UPPERCASE_LOWERCASE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (Character.isLowerCase(x)) {
                result.append(Character.toUpperCase(x));
            } else if (Character.isUpperCase(x)) {
                result.append(Character.toLowerCase(x));
            } else {
                result.append(x);
            }
        }
        System.out.println(result);
    }
}
