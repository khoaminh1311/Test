
package STRING_EXERCISE;

import java.util.Scanner;

public class COUNT_WORD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine().trim();
        int count = 1;
        for(int i = 1; i <input.length() ; i++) {
            if(input.charAt(i) == ' ' && input.charAt(i-1) != ' ') {
                count++;
            } 
        }
        System.out.println("There are "+count+" words in the string");
    }
}

