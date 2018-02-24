package homeWork13.exercise1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LettersCounterUtil {

    private LettersCounterUtil() {
    }

    private static Map<String, Integer> lettersCounter(Path path) throws IOException {
        List<String> linesList = Files.readAllLines(path);
        Map<String, Integer> charMap = new HashMap<>();

        linesList.forEach(it -> it.toLowerCase().
                codePoints()
                .mapToObj(c -> (char) c)
                .filter(value -> value >= 'а')
                .forEach(that -> {
                    charMap.merge(that.toString(), 1, (value, newValue) -> value + newValue);
                }));

        return charMap;
    }

    public static Map<String, Integer> sortedLetters(Path path) throws IOException {
        return lettersCounter(path)
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public static <K, V> void write(Path path, Map<K, V> map) {
        try (PrintWriter writer = new PrintWriter(new File(String.valueOf(path)))) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
