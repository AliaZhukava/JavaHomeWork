package homeWork13.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortNumberUtil {

    private SortNumberUtil() {
    }

    private static final int COUNT_OF_NUMBERS = 100;

    public static void listOfRandomNumbers(Path path) throws IOException {
        Random random = new Random();

        List<String> list = Stream.generate(() -> random.nextInt(100))
                .limit(COUNT_OF_NUMBERS)
                .map(String::valueOf)
                .collect(Collectors.toList());

        Files.write(path, list);
    }

    public static void sortedNumbers(Path resourcePath, Path newPath) throws IOException {
        List<String> lines = Files.readAllLines(resourcePath);

        List<String> resultLines = lines.stream()
                .map(Integer::valueOf)
                .sorted(Integer::compare)
                .map(String::valueOf)
                .collect(Collectors.toList());

        Files.write(newPath, resultLines);
    }
}
