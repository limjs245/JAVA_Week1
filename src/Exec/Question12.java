package Exec;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수: ");
        double a = sc.nextDouble();

        System.out.print("영어 점수: ");
        double b = sc.nextDouble();

        System.out.print("과학 점수: ");
        double c = sc.nextDouble();

        System.out.print("사회 점수: ");
        double d = sc.nextDouble();

        double avg = (a + b + c + d) / 4;
        if (avg >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        sc.close();
    }
}
