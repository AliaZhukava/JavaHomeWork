package HomeWork4;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {

        int[][] value = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println(linearize(value));
    }

    private static String linearize(int[][] doubleArray) {

        int[] oneLineArray = new int[doubleArray[0].length + doubleArray[1].length];
        int oneLineArrayIndex = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                oneLineArray[oneLineArrayIndex++] = doubleArray[i][j];
            }
        }
        return Arrays.toString(oneLineArray);
    }
}
