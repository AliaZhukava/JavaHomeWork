package HomeWork3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = number;
        int sum = 0;
        while (n != 0) {
            int ostatok = n %10;
            n = n / 10;
            sum += ostatok;
        }
        System.out.println(sum);
    }
}
