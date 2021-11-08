package Lesson_2; // Task 12

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {

        System.out.println("Input two numbers:");

        Scanner Int = new Scanner(System.in);

        int One = Int.nextInt();

        int Two = Int.nextInt();

        System.out.println("Sum is: " + (One + Two));
    }
}
