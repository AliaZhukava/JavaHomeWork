package HomeWork3;

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int a = 2;
        int numberFibonnachi = 0;

        while (a <= max) {
            System.out.println(numberFibonnachi);
            if (numberFibonnachi == 0) {
                numberFibonnachi = 1;
            } else {
                numberFibonnachi = fibonnachi(a);
                a = numberFibonnachi;
            }
        }
    }
    private static int fibonnachi (int value) {
        if (value == 0) return 0;
        if (value == 1) return 1;
        return fibonnachi(value - 1) + fibonnachi(value - 2);
    }
}

