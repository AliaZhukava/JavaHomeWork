package homeWork13.exercise2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SortNumberDemo {

    public static void main(String[] args) throws IOException {
        Path randomNumbers = Paths.get("src", "homeWork13", "exercise2", "numbers.txt");
        Path sortedNumbers = Paths.get("src", "homeWork13", "exercise2", "sorted_numbers.txt");

        SortNumberUtil.listOfRandomNumbers(randomNumbers);
        SortNumberUtil.sortedNumbers(randomNumbers, sortedNumbers);
    }
}
