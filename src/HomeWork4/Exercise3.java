package HomeWork4;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {

        int[] value1 = {1, 2, 3, 4, 5};
        int[] value2 = {5, 6, 7};
        int[] sumValues = new int[value1.length + value2.length];

        SumArray(value1, value2, sumValues);
        System.out.println(Arrays.toString(sumValues));
    }

    private static void SumArray(int[] value1, int[] value2, int[] sumValue) {

        int sumValueIndex = 0;
        if (value1.length > value2.length) {
            for (int i = 0; i < value1.length; i++) {
                if (i < value2.length) {
                    sumValue[sumValueIndex++] = value1[i];
                    sumValue[sumValueIndex++] = value2[i];
                } else {
                    sumValue[sumValueIndex++] = value1[i];
                }
            }
        } else {
            for (int i = 0; i < value2.length; i++) {
                if (i < value1.length) {
                    sumValue[sumValueIndex++] = value1[i];
                    sumValue[sumValueIndex++] = value2[i];
                } else {
                    sumValue[sumValueIndex++] = value2[i];
                }
            }
        }
    }
}