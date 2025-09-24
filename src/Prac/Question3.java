package Prac;

public class Question3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;
        array2[0] = 100;
        System.out.println(array1[0]);
    }
}
