
package STRING_EXERCISE;

import java.util.Scanner;

public class LONGEST_WORD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int lengthMax = 0;
        int index = 0;
        for(int i = 0; i <words.length; i++) {
            int length = words[i].length();
            if(length > lengthMax) {
                lengthMax = length;
                index = i;
            }
        }
        System.out.println("Longest word in the string is: "+words[index]);
}
}


