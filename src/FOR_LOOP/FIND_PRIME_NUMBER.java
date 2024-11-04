
package test.FOR_LOOP;

public class FIND_PRIME_NUMBER {
    public static boolean find(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       System.out.println("Prime number from 1 to 100: ");
       for(int i= 1; i <=100; i++) {
           if(find(i) == true) {
               System.out.print(i + " ");
           }
       }
    } 
}


