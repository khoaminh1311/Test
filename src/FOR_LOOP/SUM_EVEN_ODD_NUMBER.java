
package test.FOR_LOOP;

public class SUM_EVEN_ODD_NUMBER {
    public static void sumEvenOdd() {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("Sum of even number: " +sumEven);
        System.out.println("Sum of odd number: " +sumOdd);
    }
    public static void printEvenOdd() {
        System.out.println("List of even number: ");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(+ i + "; ");
            } 
        }
        System.out.println("List of odd number: ");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                System.out.print(+ i + "; ");
            } 
        }       
    }
    public static void main(String[] args) {
        SUM_EVEN_ODD_NUMBER.sumEvenOdd();
        SUM_EVEN_ODD_NUMBER.printEvenOdd();
    } 
}
