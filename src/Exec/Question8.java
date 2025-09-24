package Exec;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키: ");
        double height = sc.nextDouble();

        System.out.print("몸무게: ");
        double weight = sc.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi <= 24.9) {
            System.out.println("정상");
        } else if (bmi <= 29.9) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }

        sc.close();
    }
}
