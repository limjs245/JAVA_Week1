package InternetExample;

import java.util.Scanner;

public class SimplerCircle {
    public static void drawCircle(int radius) {
        // y 좌표를 -radius 부터 +radius 까지 순회
        for (int y = -radius; y <= radius; y++) {
            // x 좌표도 -radius 부터 +radius 까지 순회 (가로 길이 보정 제거)
            for (int x = -radius; x <= radius; x++) {
                // 원의 방정식: x^2 + y^2 <= r^2 인지 검사
                if (x * x + y * y <= radius * radius) {
                    System.out.print("⬜|"); // 원 안쪽
                } else {
                    System.out.print("⬛|"); // 원 바깥쪽
                }
            }
            System.out.println(); // 한 줄 그렸으면 줄바꿈
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = input.nextInt();
        drawCircle(r);
        input.close();
    }
}