/*Exercise 2: Fibonacci Sequence
Write a program to print the first n elements of the Fibonacci sequence (with n input from the user). 
Use a for loop and conditional statements to generate the Fibonacci sequence. 
For example, if n = 7, the Fibonacci sequence will be 0, 1, 1, 2, 3, 5, 8.
 */
package test.NESTED_LOOP;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int x1 = 0;
        int x2 = 1;
        int x3 = 0;
        for(int i = 1; i <=n; i++) {
            System.out.print(x3 +" ");
            x3 = x1 + x2;
            x2 = x1;
            x1 = x3;
          
        }
        
    }
    public static void main(String[] args) {
        Fibonacci.fibonacci();
    }
}       
