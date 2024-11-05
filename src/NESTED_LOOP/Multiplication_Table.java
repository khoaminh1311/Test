
package test.NESTED_LOOP;

public class Multiplication_Table {
    public static void print() {
        for(int i = 1; i<=10; i++) {
            System.out.println("Multiplication Table "+i+" times: ");
            for(int j = 1; j<=10; j++) {
            System.out.println(i + "x" + j + "=" + i*j);
        }
    }
  } 
       public static void main(String[] args) {
        Multiplication_Table.print();
    }
 
}
