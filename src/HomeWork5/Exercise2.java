package HomeWork5;

public class Exercise2 {
    public static void main(String[] args) {

        String romanianNumber = "MMMCMXCIX";
        System.out.println(newDateType(romanianNumber));

    }

    private static int newDateType(String romanianNumber) {

        int arabicNumber = 0;

        for (int i = 0; i < romanianNumber.length(); i++) {
            switch (romanianNumber.charAt(i)) {
                case 'M':
                    arabicNumber += 1000;
                    if (i > 0) {
                        if (romanianNumber.charAt(i - 1) == 'C') {
                            arabicNumber -= 200;
                        }
                    }
                    break;

                case 'D':
                    arabicNumber += 500;
                    if (i > 0) {
                        if (romanianNumber.charAt(i - 1) == 'C') {
                            arabicNumber -= 200;
                        }
                    }
                    break;

                case 'C':
                    arabicNumber += 100;
                    if (i > 0) {
                        if (romanianNumber.charAt(i - 1) == 'X') {
                            arabicNumber -= 20;
                        }
                    }
                    break;

                case 'L':
                    arabicNumber += 50;
                    if (i > 0) {
                        if (romanianNumber.charAt(i - 1) == 'X') {
                            arabicNumber -= 20;
                        }
                    }
                    break;

                case 'X':
                    arabicNumber += 10;
                    if (i > 0) {
                        if (romanianNumber.charAt(i - 1) == 'I') {
                            arabicNumber -= 2;
                        }
                    }
                    break;

                case 'V':
                    arabicNumber += 5;
                    if (i > 0) {
                        if (romanianNumber.charAt(i - 1) == 'I') {
                            arabicNumber -= 2;
                        }
                    }
                    break;

                case 'I':
                    arabicNumber += 1;
                    break;
                default:
                    arabicNumber = 0;
                    break;
            }
        }
        return arabicNumber;
    }
}
