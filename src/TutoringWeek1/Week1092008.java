package TutoringWeek1;

import java.util.Scanner;

public class Week1092008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("등급: ");
        int grade = sc.nextInt();
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println("발급받은 쿠폰: " + coupon);

        sc.close();
    }
}
