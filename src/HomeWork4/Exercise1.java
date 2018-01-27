package HomeWork4;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] values = {4, 6, 7, 8, 10, 12};

        ShiftOfArray(values);
        System.out.println(Arrays.toString(values));
    }

    private static void ShiftOfArray(int[] values) {
        int thirdChear = values[values.length - 1];
        for (int i = values.length - 2; i >= 0; i--) {
            values[i + 1] = values[i];
        }
        values[0] = thirdChear;
    }
}

