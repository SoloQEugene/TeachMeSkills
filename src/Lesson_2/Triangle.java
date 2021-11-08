package Lesson_2; // Task_4

public class Triangle {
    public static void main(String[] args) {

        int countTri = 3;

        int degrees = 180;

        int Tria = degrees / countTri;

        System.out.println(Tria == 60); // option one

        int TriaA = 60;

        int TriaB = 60;

        int TriaC = 60;

        System.out.println(TriaA + TriaB + TriaC == 180); // option two

    }
}
