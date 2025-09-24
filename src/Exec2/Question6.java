package Exec2;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("num1: ");
        int n = sc.nextInt();

        System.out.print("num2: ");
        int n2 = sc.nextInt();

        int n3 = n2;
        int n4 = n2;

        while (n % n3 != 0) {
            n3 = n % n4;
            n4 = n3;
        }
        System.out.println(n4);
        sc.close();
    }
}
