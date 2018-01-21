package HomeWork3;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int a = 0;
        int b = 1;
        int numberFibonnachi = 0;

        while (numberFibonnachi <= max) {
            System.out.println(numberFibonnachi);
            if (numberFibonnachi == 0) {
                numberFibonnachi = 1;
            } else {
                numberFibonnachi = a + b;
                a = b;
                b = numberFibonnachi;
            }
        }
    }
}
