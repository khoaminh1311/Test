package test;

import java.util.Scanner;

public class BT_InputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: "); //tên
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.print("Age: "); //tuổi
        int age = scanner.nextInt();
        System.out.println("Age: " + age);
        System.out.print("Gender: "); //giới tính
        String sex = scanner.next();
        System.out.println("Gender: " + sex);
        scanner.nextLine();
        System.out.print("Major: "); //chuyên ngành
        String major = scanner.nextLine();
        System.out.println("Major: " + major);
        System.out.print("GPA: "); //gpa
        double gpa = scanner.nextDouble();
        System.out.println("GPA: " + gpa);
        scanner.nextLine();
        System.out.print("Hometown: "); //hometown
        String hometown = scanner.nextLine();
        System.out.println("Hometown: " + hometown);
//BT2+3    

        System.out.print("Enter something: ");
        System.out.println("Is this a string? " + scanner.hasNext());
        System.out.println("Is this a float? " + scanner.hasNextFloat());
    }

}
