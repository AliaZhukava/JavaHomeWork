package HomeWork3;

import java.util.Scanner;

public class Exercise2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int max = scanner.nextInt();
            fibonnachi(0, 0, max);
        }
    }

    private static void fibonnachi(int prevValue, int currentValue, int stopValue) {
        if (currentValue < stopValue) {
            boolean isFirst = currentValue == 0;
            System.out.printf(isFirst ? "%d" : ", %d", currentValue);
            fibonnachi(isFirst ? 1 : currentValue, isFirst ? 1 : currentValue + prevValue, stopValue);
        }
    }
}

