package Experiment;

import java.util.Scanner;

public class E_001 {
    public static double IntegralOfCircle(int x, int r) {
        double sqrtValue1 = Math.sqrt(2 * r - x);
        return (2 * (r * r) * Math.atan(Math.sqrt(x) / sqrtValue1)) + (Math.sqrt(x) * sqrtValue1 * (x - r));
        // 원의 방정식 (x - r)^2 + y^2 = r^2 을 y에 대한 식으로 바꾸면 |y| = root(r^2 - (x - r)^2)가 됨.
        // 적분의 용이를 위해 y = root(r^2 - (x - r)^2) 로 변경(y < 0 일 때 x의 값이 존재하지 않음).
        // 위 식 f(x) = root(r^2 - (x - r)^2)은 반원의 그래프이므로, 적분하면 반원의 넓이를 구할 수 있음(구간 [0, 2r]에 대한 f(x)의 적분 값은 반원의 넓이).
        // 적분하여 2를 곱한 식은 다음과 같음.
        // 2 * r^2 * tan^-1(root(x) / root(2 * r - x)) + root(x) * root(2 * r - x) * (x - r)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        int radius = input.nextInt();

        for (int i = 0; i < 2 * radius; i++) {
            double numberOfRepeat = Math.round(IntegralOfCircle(i + 1, radius) - IntegralOfCircle(i, radius));
            // f(x) 에서 [0,1], ..., [r - 1, r] 로 구간을 나누어서 f(x)를 해당 구간에 대해 적분하여 값을 구함(위에서 이미 2배를 했음).
            // 구간을 나눠 적분한 까닭은 console창에서 실수를 표현할 수 없기에 원을 구간으로 나눠서 구간의 넓이를 가까운 정수로 바꾸어 출력하기로 함.
            double numberOfSpaceRepeat = Math.ceil((2 * radius - numberOfRepeat) / 2); // 공백 측정
            int intOfRepeat = (int) numberOfRepeat;
            int intOfSpace = (int) numberOfSpaceRepeat;

            if (intOfSpace > 0 && intOfRepeat % 2 == 1) { // intOfRepeat값이 홀수일 때와 intOfRepeat값이 짝수일 때의 공백 차이를 주기 위함.
                System.out.print("⬛.".repeat(intOfSpace));
            } else {
                System.out.print("⬛.".repeat(intOfSpace));
                System.out.print("..");
            }

            System.out.println("⬜|".repeat(intOfRepeat));
        }
        input.close();
    }
}
