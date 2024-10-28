
package test;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
      // nhập họ và tên
       System.out.print("Nhap ho va ten: ");
       String name = keyboard.nextLine();
       System.out.println("Ho va ten: " + name);
      //nhập mssv
       System.out.print("Nhap MSSV: ");
       long num = keyboard.nextLong();
       keyboard.nextLine();
       System.out.println("MSSV: " + num);
//       nhập tên lớp
       System.out.print("Nhap ten lop: ");
       String c = keyboard.nextLine();
       System.out.println("Ma lop: " + c);
//       System.out.println("Hello World");
//       System.out.println("Tra Van Minh Khoa");
//       System.out.println("CMU-CS 303 AGIS");
//       System.out.println("2921905467");
    }
    
}
