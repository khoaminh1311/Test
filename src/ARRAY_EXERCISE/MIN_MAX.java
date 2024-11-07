
package ARRAY_EXERCISE;

import java.util.Scanner;

public class MIN_MAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of array: ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i <  num; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
                int max = a[0],min = a[0];
        for(int i = 1; i < num; i++) {  
            if(a[i] > max) {
                max = a[i];
            } else {
                min = a[i];
            }
        }
         System.out.println("Largest element of the array: "+max);
         System.out.println("Smallest element of the array: "+min);
    }
}
