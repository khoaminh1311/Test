package test.IF_ELSE;

import java.util.Scanner;

public class PT_BAC2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2: ax^2 + b = 0 ");
        System.out.print("Nhap a: "); //nhập hệ số a
        double a = scanner.nextInt();
        System.out.print("Nhap b: "); //nhập hệ số b
        double b = scanner.nextInt();
        System.out.print("Nhap c: "); //nhập hệ số c
        double c = scanner.nextInt();
        double delta = b * b - 4 * a * c; //khai báo delta
        double x1, x2; //khai báo 2 nghiệm x1,x2
        //dùng if-else để kiểm tra delta
        if (delta < 0) { //nếu delta < 0 thì phương trình vô nghiệm
            System.out.println("Phuong trinh vo  nghiem");
        } else if (delta == 0) { //nếu delta = 0 thì phương trình có nghiệm kép: x1 = x2 = -b/2a
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + -b / 2 * a);
        } else {
//nếu không rơi vào 2 trường hợp trên thì phương trình có 2 nghiệm
//phương thức Math.sqrt dùng để tính căn bậc 2, vì phương thức trả về kiểu double nên ban đầu ta khai báo các biến là kiểu double
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + " va nghiem x2 = " + x2);
        }
    }
}
