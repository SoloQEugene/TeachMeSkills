package Lesson_2; // Task 14

import java.util.Scanner;


public class ScanFunction {
    public static void main(String[] args) {

        System.out.println("Введите последовательно значения дла a, b, c: ");

        Scanner Functions = new Scanner(System.in);

        int a = Functions.nextInt();

        int b = Functions.nextInt();

        int c = Functions.nextInt();

        int result = ((a - 3) * b / 2) + c;

        System.out.println("Значение функции " + result);
    }
}
