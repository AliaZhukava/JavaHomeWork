package homeWork9;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<String> originalList = new ArrayList();
        originalList.add("this");
        originalList.add("is");
        originalList.add("lots");
        originalList.add("of");
        originalList.add("fun");
        originalList.add("for");
        originalList.add("every");
        originalList.add("Java");
        originalList.add("programmer");

        markLength4(originalList);
    }

    private static void markLength4(List<String> originalList) {
        List<String> newList = new ArrayList();
        for (String word : originalList) {
            if (word.length() == 4) {
                newList.add("****");
                newList.add(word);
            } else {
                newList.add(word);
            }
        }
        System.out.println(newList.toString());
    }
}
