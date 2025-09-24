package TutoringWeek1;

import java.util.Scanner;

// psvm
// sout
// tab key

public class Week1092001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.next();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("좋아하는 색깔을 입력하세요: ");
        String color = sc.next();

        System.out.println("안녕하세요! " + name + "님, " + age + "살이시군요. 좋아하는 색깔은 " + color + "이네요!");

        sc.close();
    }
}
