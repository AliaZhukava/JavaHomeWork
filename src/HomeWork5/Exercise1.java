package HomeWork5;

public class Exercise1 {
    public static void main(String[] args) {

      String word = new String("анна");

        System.out.println(reverseWord(word));
    }

    private static boolean reverseWord(String testWord) {
       return testWord.equalsIgnoreCase(new StringBuilder(testWord).reverse().toString());
    }
}
