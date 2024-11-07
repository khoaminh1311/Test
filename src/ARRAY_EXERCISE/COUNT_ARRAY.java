
package ARRAY_EXERCISE;

import java.util.Scanner;

public class COUNT_ARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of array: ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        int count = 0;
        System.out.print("Enter the number you want to find: ");
        int n = scanner.nextInt();
        for (int i = 0; i <  num; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
            if(a[i] == n) {
                count++;
            }
        }
        System.out.println("How many times the number appear in the array? - "+count);
    }
}
