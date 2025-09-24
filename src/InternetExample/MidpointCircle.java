package InternetExample;

import java.util.Arrays;
import java.util.Scanner;

public class MidpointCircle {

    public static void drawCircle(int r) {
        // 배열의 타입을 String으로 변경
        String[][] buffer = new String[2 * r + 1][2 * r + 1];

        // 버퍼를 배경 문자열("⬛")로 초기화
        for (String[] value : buffer) {
            // 쌍따옴표 사용
            Arrays.fill(value, "⬛|");
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
        for (String[] strings : buffer) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    // 매개변수 타입을 String[][]으로 변경
    private static void plotCirclePoints(String[][] buffer, int radius, int x, int y) {
        // 원을 그리는 문자열을 "⬜|"로 변경
        String circleChar = "⬜|";

        buffer[radius + y][radius + x] = circleChar;
        buffer[radius + y][radius - x] = circleChar;
        buffer[radius - y][radius + x] = circleChar;
        buffer[radius - y][radius - x] = circleChar;
        buffer[radius + x][radius + y] = circleChar;
        buffer[radius + x][radius - y] = circleChar;
        buffer[radius - x][radius + y] = circleChar;
        buffer[radius - x][radius - y] = circleChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = input.nextInt();
        drawCircle(r);
        input.close();
    }
}