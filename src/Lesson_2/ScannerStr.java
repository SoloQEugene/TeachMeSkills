package Lesson_2; // Task 13

import java.util.Scanner;

public class ScannerStr {
    public static void main(String[] args) {

        System.out.println("Inter your name:");

        Scanner Enter = new Scanner(System.in);
        String Name = Enter.nextLine();

        System.out.println("Your name is: " + Name);
    }
}
