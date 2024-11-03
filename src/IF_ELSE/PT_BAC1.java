package test.IF_ELSE;

import java.util.Scanner;

public class PT_BAC1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 1: ax + b = 0 ");
        System.out.print("Nhap a: "); // nhập hệ số a
        float a = scanner.nextInt();
        System.out.print("Nhap b: "); //nhap hệ số b
        float b = scanner.nextInt();
        //dùng if-else để kiểm tra điều kiện của a và b
        if (a == 0 && b == 0) { //nếu a và b bằng 0 thì phương trình vô số nghiệm
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) { //nếu a bằng 0 và b khác 0 thì phương trình vô nghiệm
            System.out.println("Phuong trinh vo  nghiem");
        } else { //nếu không rơi vào 2 trường hợp trên thì phương trình có nghiệm x = =b/a
            float x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}
