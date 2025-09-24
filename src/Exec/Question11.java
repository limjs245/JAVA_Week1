package Exec;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();

        System.out.print("세 번째 숫자: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        }
    }
}
