package TutoringWeek1;

import java.util.Scanner;

public class Week1092007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        int year = sc.nextInt();

        if (year >= 20) {
            System.out.println("성인입니다.");
        } else if (year >= 17 && year <= 19) {
            System.out.println("고등학생입니다.");
        } else if (year >= 14 && year <= 16) {
            System.out.println("중학생입니다.");
        } else if (year >= 8 && year <= 13) {
            System.out.println("초등학생입니다.");
        }  else if (year <= 7) {
            System.out.println("미취학 아동입니다.");
        }

        sc.close();
    }
}
