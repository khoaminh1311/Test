/*
 * Exercise 1: Number Guessing Game
Write a program that allows the user to guess a random number from 1 to 50. 
Use a while loop to repeat until the user guesses correctly. For each guess, use a conditional statement 
to provide hints like "Your number is higher" or "Your number is lower."
*/
package test.NESTED_LOOP;

import java.util.Random;
import java.util.Scanner;

public class GUESS_NUMBER {
    public static void guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        Random random = new Random();
        int RandomNumber = random.nextInt(50) + 1;
        while(a != RandomNumber) {
            if(a > RandomNumber) {
                System.out.print("Your number is higher. Guess again: ");
                 a = scanner.nextInt();
            } else if(a < RandomNumber) {
                System.out.print("Your number is lower. Guess again: ");
                 a = scanner.nextInt();
            }
        }
        System.out.print("You guess the correct number.");
    }
    public static void main(String[] args) {
        GUESS_NUMBER.guess();
    }
}
