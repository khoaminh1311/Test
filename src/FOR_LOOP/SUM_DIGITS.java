
package test.FOR_LOOP;

import java.util.Scanner;

public class SUM_DIGITS {
    public static void sumDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = scanner.nextInt();
        int sumDigit = 0;
        int digit = 0;
        while(n > 0) {
            digit = n%10;
            n = n/10;
            sumDigit = sumDigit + digit;
    }
        System.out.println("Sum of digit: " +sumDigit);
    }
    public static void main(String[] args) {
       SUM_DIGITS.sumDigits();
    } 
}
