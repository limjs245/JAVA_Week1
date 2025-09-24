package Exec;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 숫자: ");
        double a = sc.nextDouble();

        System.out.print("두 번째 숫자: ");
        double b = sc.nextDouble();

        System.out.print("세 번째 숫자: ");
        double c = sc.nextDouble();

        System.out.print("첫 연산자: ");
        String o1 = sc.next();

        System.out.print("두 번째 연산자: ");
        String o2 = sc.next();

        switch (o1) {
            case "+":
                switch (o2) {
                    case "+":
                        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
                        break;
                    case "-":
                        System.out.println(a + " + " + b + " - " + c + " = " + (a + b - c));
                        break;
                    case "*":
                        System.out.println(a + " + " + b + " * " + c + " = " + (a + b * c));
                        break;
                    case "/":
                        System.out.println(a + " + " + b + " / " + c + " = " + (a + b / c));
                        break;
                }
                break;
            case "-":
                switch (o2) {
                    case "+":
                        System.out.println(a + " - " + b + " + " + c + " = " + (a - b + c));
                        break;
                    case "-":
                        System.out.println(a + " - " + b + " - " + c + " = " + (a - b - c));
                        break;
                    case "*":
                        System.out.println(a + " - " + b + " * " + c + " = " + (a - b * c));
                        break;
                    case "/":
                        System.out.println(a + " - " + b + " / " + c + " = " + (a - b / c));
                        break;
                }
                break;
            case "*":
                switch (o2) {
                    case "+":
                        System.out.println(a + " * " + b + " + " + c + " = " + (a * b + c));
                        break;
                    case "-":
                        System.out.println(a + " * " + b + " - " + c + " = " + (a * b - c));
                        break;
                    case "*":
                        System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));
                        break;
                    case "/":
                        System.out.println(a + " * " + b + " / " + c + " = " + (a * b / c));
                        break;
                }
                break;
            case "/":
                switch (o2) {
                    case "+":
                        System.out.println(a + " / " + b + " + " + c + " = " + (a / b + c));
                        break;
                    case "-":
                        System.out.println(a + " / " + b + " - " + c + " = " + (a / b - c));
                        break;
                    case "*":
                        System.out.println(a + " / " + b + " * " + c + " = " + (a / b * c));
                        break;
                    case "/":
                        System.out.println(a + " / " + b + " / " + c + " = " + (a / b / c));
                        break;
                }
                break;
        }

        sc.close();
    }
}
