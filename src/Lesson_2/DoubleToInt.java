package Lesson_2; // Task_5

public class DoubleToInt {
    public static void main(String[] args) {

        double First = 5.6;

        int IntegerOne = (int) First;

        System.out.println(IntegerOne); // округляет до точки

        double Second = 5.6;

        System.out.println(Math.round(Second)); // округляет до ближайшего числа
    }
}
