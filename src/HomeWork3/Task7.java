package HomeWork3;

public class Task7 {
    public static void main(String[] args) {
        int number = 1234567;
        int n = number;
        String sum = "";
        while (n != 0) {
            int ostatok = n % 1000;
            n = n / 1000;
            sum = ostatok + " " + sum;

        }
        System.out.println(sum);
    }
}