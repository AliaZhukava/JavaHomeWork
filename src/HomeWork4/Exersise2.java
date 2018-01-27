package HomeWork4;

import java.util.Arrays;

public class Exersise2 {
    public static void main(String[] args) {
        int[] values = {4, 6, 7, 4, 10, 7};
        SearchTheSame(values);
        System.out.println(Arrays.toString(values));
    }

    private static void SearchTheSame(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] == values[i]) {
                    values[j] = 0;
                }
            }
        }
    }
}
