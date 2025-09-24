package Exec;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();

        System.out.print("연산자(+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("결과: " + (num1 + num2));
            case "-":
                System.out.println("결과: " + (num1 - num2));
            case "*":
                System.out.println("결과: " + (num1 * num2));
            case "/":
                System.out.println("결과: " + (num1 / num2));
        }

        sc.close();
    }
}
