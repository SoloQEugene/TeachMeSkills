package Lesson_2; // Task 15

import java.util.Scanner;

public class ScannerFormula {
    public static void main(String[] args) {

        System.out.println("Введите последовательно значения дла a, b, c: ");

        Scanner Formula = new Scanner(System.in);

        double a = Formula.nextDouble();

        double b = Formula.nextDouble();

        double c = Formula.nextDouble();

        double root = Math.sqrt(b * b + 4 * a * c);

        double degree = Math.pow(b, -3);

        double result = ((b + root) / (2 * a)) - (a * 3 * c + degree);

        System.out.println("Значение формулы " + result);
    }
}
