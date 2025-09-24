package InternetExample;

import java.util.Scanner;

public class MidpointCircle {

    public static void drawCircle(int r) {
        // 배열의 타입을 String으로 변경
        String[][] buffer = new String[2 * r + 1][2 * r + 1];

        // 버퍼를 배경 문자열("⬛")로 초기화
        for (int i = 0; i < buffer.length; i++) {
            for (int j = 0; j < buffer[i].length; j++) {
                buffer[i][j] = "⬛|"; // 쌍따옴표 사용
            }
        }

        int x = 0;
        int y = r;
        int p = 1 - r;

        plotCirclePoints(buffer, r, x, y);

        while (x < y) {
            x++;
            if (p < 0) {
                p += 2 * x + 1;
            } else {
                y--;
                p += 2 * (x - y) + 1;
            }
            plotCirclePoints(buffer, r, x, y);
        }

        // 버퍼 내용 출력
        for (int i = 0; i < buffer.length; i++) {
            for (int j = 0; j < buffer[i].length; j++) {
                System.out.print(buffer[i][j]);
            }
            System.out.println();
        }
    }

    // 매개변수 타입을 String[][]으로 변경
    private static void plotCirclePoints(String[][] buffer, int radius, int x, int y) {
        int centerX = radius;
        int centerY = radius;

        // 원을 그리는 문자열을 "⬜|"로 변경
        String circleChar = "⬜|";

        buffer[centerY + y][centerX + x] = circleChar;
        buffer[centerY + y][centerX - x] = circleChar;
        buffer[centerY - y][centerX + x] = circleChar;
        buffer[centerY - y][centerX - x] = circleChar;
        buffer[centerY + x][centerX + y] = circleChar;
        buffer[centerY + x][centerX - y] = circleChar;
        buffer[centerY - x][centerX + y] = circleChar;
        buffer[centerY - x][centerX - y] = circleChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = input.nextInt();
        drawCircle(r);
        input.close();
    }
}