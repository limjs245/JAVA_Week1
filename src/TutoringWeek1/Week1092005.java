package TutoringWeek1;

import java.util.Scanner;

public class Week1092005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("섭씨 온도: ");
        double a = sc.nextDouble();

        System.out.println("화씨 온도 = " + (a * 9 / 5 + 32));

        sc.close();
    }
}
