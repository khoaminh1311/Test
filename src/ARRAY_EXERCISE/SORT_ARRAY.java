
package ARRAY_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class SORT_ARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of array: ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i <  num; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        int temp;
         for (int i = 0; i <  num; i++) {
             for(int j = i+1; j<num; j++) {
            if(a[i]>a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
         System.out.println("Array in ascending order: " +Arrays.toString(a));  
}
}
