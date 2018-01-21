package HomeWork2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double result;
        double result2;

        if (isZero(a)) {
           result = (- c) / b;
            System.out.println(result);
        } else if (isZero(discriminant(a, b, c))) {
            result = (- b) / (2 * a);
            System.out.println(result);
        } else if (isPositive(discriminant(a, b, c))) {
            result = (-b +  Math.sqrt(discriminant(a, b, c))) / (2 * a);
            result2 = (-b -  Math.sqrt(discriminant(a, b, c))) / (2 * a);
            System.out.println(result + "; " + result2);
        } else {
            System.out.println("Error: D < 0");
        }
    }

    private static boolean isPositive (int ifPositive) {return ifPositive > 0;}

    private static boolean isZero (int ifZero) {return ifZero == 0;}

    private static int discriminant(int x, int y, int z) {
        return y * y - 4 * x * z;
    }
}
