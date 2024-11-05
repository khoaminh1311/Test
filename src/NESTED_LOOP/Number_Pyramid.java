
package test.NESTED_LOOP;

import java.util.Scanner;

public class Number_Pyramid {
    public static void pyramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
               System.out.println();
        }
    }
    public static void main(String[] args) {
        Number_Pyramid.pyramid();
    }
}
