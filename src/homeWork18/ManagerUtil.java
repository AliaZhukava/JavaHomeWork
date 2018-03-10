package homeWork18;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerUtil {

    private static final Pattern END_OF_DAY_PATTERN = Pattern.compile("^$");

    private ManagerUtil() {
    }

    public static Deque<String> readFile(Path path) {
        Deque<String> timeQueue = new ArrayDeque<>();

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                Matcher matcher = AnalyzerUtil.PATTERN.matcher(currentLine);
                if (matcher.find()) {
                    timeQueue.add(matcher.group("time"));
                    timeQueue.add(matcher.group("activity"));
                } else {
                    Matcher emptyLineMatcher = END_OF_DAY_PATTERN.matcher(currentLine);
                    if (emptyLineMatcher.find()) {
                        timeQueue.add(AnalyzerUtil.SEPARATOR);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return timeQueue;
    }

    public static void writeFile(Path resultFile, String data) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile.toFile()))) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
