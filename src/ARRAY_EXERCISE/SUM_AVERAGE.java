
package ARRAY_EXERCISE;

import java.util.Scanner;

public class SUM_AVERAGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of array: ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        int sum = 0;
        for (int i = 0; i <  num; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        double average = (double) sum/num;
        System.out.println("Sum of array: "+sum);
        System.out.printf("Average of array: %.1f",average);//sử dụng dấu , để truyền tham số trong printf 
                                                             //ko dùng dấu +
    }
}
