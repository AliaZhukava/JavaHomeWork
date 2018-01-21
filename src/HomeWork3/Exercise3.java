package HomeWork3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
         int days = N;
         int sum = 0;
         int max = 0;
         while (days !=0) {
             int osadki = scanner.nextInt();
             days--;
             sum = sum + osadki;
             if (osadki > max) {
                 max = osadki;
             }
         }

        System.out.println("За " + N + " дней выпало " + sum + " мм осадков. Максимальное количество осадков за день: "
                + max + "мм");
    }
}
