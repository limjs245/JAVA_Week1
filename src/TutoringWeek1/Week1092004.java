package TutoringWeek1;

import java.util.Scanner;

public class Week1092004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1: ");
        double n = sc.nextDouble();

        System.out.print("숫자2: ");
        double m = sc.nextDouble();

        System.out.println("숫자1 + 숫자2 = " + (n + m));
        System.out.println("숫자1 - 숫자2 = " + (n - m));
        System.out.println("숫자1 * 숫자2 = " + (n * m));
        System.out.println("숫자1 / 숫자2 = " + (n / m));

        sc.close();
    }
}
