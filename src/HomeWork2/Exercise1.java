package HomeWork2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month++;
                } else if (day >= 1 && day < 31) {
                    day++;
                } else {
                    System.out.println("Нет такого дня");
                    day = 0;
                    month = 0;
                    year = 0;
                }
                break;
            case 2:
                if (year % 4 == 0 && year % 400 == 0 || !(year % 100 == 0)) {
                    if (day == 29) {
                        day = 1;
                        month++;
                    } else if (day >= 1 && day < 29) {
                        day++;
                    } else {
                        System.out.println("Нет такого дня");
                        day = 0;
                        month = 0;
                        year = 0;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month++;
                    } else if (day >= 1 && day < 28) {
                        day++;
                    } else {
                        System.out.println("Нет такого дня");
                        day = 0;
                        month = 0;
                        year = 0;
                    }
                }

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month++;
                } else if (day >= 1 && day < 30) {
                    day++;
                } else {
                    System.out.println("Нет такого дня");
                    day = 0;
                    month = 0;
                    year = 0;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else if (day >= 1 && day < 31) {
                    day++;
                } else {
                    System.out.println("Нет такого дня");
                    day = 0;
                    month = 0;
                    year = 0;
                }
                break;
            default:
                System.out.println("Нет такого месяца");
                day = 0;
                month = 0;
                year = 0;
        }

        System.out.println(nextDay(day, month, year));
    }

    private static String nextDay(int nextDay, int nextMonth, int nextYear) {

        return nextDay + "-" + nextMonth + "-" + nextYear;
    }
}
