
package STRING_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class SPLIT_WORD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String INPUT = scanner.nextLine();
        String[] wordArray = INPUT.split(" ");
        System.out.println(Arrays.toString(wordArray));
    }
}


