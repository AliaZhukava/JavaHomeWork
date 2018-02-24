package homeWork13.exercise1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LettersCounterDemo {

    public static void main(String[] args) throws IOException {
        Path poem = Paths.get("src", "homeWork13", "exercise1", "poem.txt");
        Path letterList = Paths.get("src", "homeWork13", "exercise1", "letters.txt");

        LettersCounterUtil.write(letterList, LettersCounterUtil.sortedLetters(poem));
    }
}
