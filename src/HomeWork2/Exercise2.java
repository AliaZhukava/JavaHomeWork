package HomeWork2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        if (((a + c) <= e && b <= f && d <= f) ||
                ((b + c) <= e && a <= f && d <= f) ||
                ((a + d) <= e && b <= f && c <= f) ||
                ((b + d) <= e && a <= f && c <= f) ||
                ((a + c) <= f && b <= e && d <= e) ||
                ((b + c) <= f && a <= e && d <= e) ||
                ((a + d) <= f && b <= e && c <= e) ||
                ((b + d) <= f && a <= e && c <= e)
                ) {
            System.out.println("Дома помещаются на участке");
        } else {
            System.out.println("Дома не помещаются на участке");
        }
    }

}
