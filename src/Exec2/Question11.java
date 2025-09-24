package Exec2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = 1;

        System.out.print("height of rhombus(odd): ");
        int height = sc.nextInt();

        if (height % 2 == 0) { // 마름모의 높이, height는 홀수여야 함. 중앙 한 줄을 기준으로 대칭을 이뤄야 하기 때문.
            System.out.println("Please enter odd number");
            height = 0;
        }

        int line = height / 2 + 1;
        System.out.println();

        // 삼각형 출력
        for (int i = line; i <= line * 2 - 1; i++) { // n줄이면 칸의 개수가 2n - 1개여야 함. n번째 줄에서 별의 개수가 2n - 1개이기 때문.
            for (int j = 1; j <= (i - star); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star += 2;
        }
        // star의 개수가 칸의 개수보다 2 많아지므로 -2를 함.
        star -= 2;
        // 마름모를 출력하기 위해서 뒤집은 삼각형을 출력
        for (int i2 = line * 2 - 1 - 2; i2 >= line - 1; i2--) {  // 뒤집은 삼각형은 n - 1 줄이여야 함. 기존 삼각형에서 1줄 줄어듬.
            for (int j2 = 1; j2 <= (i2 - star + 3); j2++) { // 칸의 개수는 2n - 3인데, star의 개수는 2n - 1개 이므로 +3을 함.
                System.out.print(" ");
            }
            for (int k2 = 1; k2 <= star - 2; k2++) {
                System.out.print("*");
            }
            System.out.println();
            star -= 2;
        }

        sc.close();
    }
}
