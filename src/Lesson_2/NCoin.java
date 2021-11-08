package Lesson_2; // Task 8

public class NCoin {
    public static void main(String[] args) {

        int N = 223;
        int Rub = N/100;
        int Coin = N - Rub*100;
        System.out.println(Rub + "руб " + Coin + "коп");
    }
}
