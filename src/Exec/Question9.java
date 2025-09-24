package Exec;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        double a = sc.nextDouble();

        System.out.print("두 번째 숫자: ");
        double b = sc.nextDouble();

        System.out.print("연산자: ");
        String o = sc.next();

        if (o.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (o.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (o.equals("*")) {
            System.out.println(a + " + " + b + " = " + (a * b));
        } else if (o.equals("/")) {
            if (a == 0 || b ==  0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        }

        sc.close();
    }
}
