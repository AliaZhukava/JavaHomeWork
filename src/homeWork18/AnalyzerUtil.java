package homeWork18;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyzerUtil {

    public static final Pattern PATTERN = Pattern.compile("(?<time>(?<hour>\\d{2}):(?<minute>\\d{2}))(\\s)?(?<activity>.+$)?");
    public static final String SEPARATOR = "";
    private static final Pattern REPETITIVE_PATTERN = Pattern.compile("Упражнения|Перерыв|Обед|Решения");

    private AnalyzerUtil() {
    }

    private static Integer countOfMinutes(String stringTime) {
        Matcher timeMatcher = PATTERN.matcher(stringTime);
        Integer minutes = 0;

        while (timeMatcher.find()) {
            minutes = Integer.valueOf(timeMatcher.group("hour")) * 60
                    + Integer.valueOf(timeMatcher.group("minute"));
        }

        return minutes;
    }

    private static String mapToString(Map<String, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        Integer sumTime = map.values().stream()
                .mapToInt(Integer::valueOf)
                .sum();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String string = entry.getKey() + ": " + entry.getValue();
            stringBuilder.append(string)
                    .append(" минут ")
                    .append(entry.getValue() * 100 / sumTime)
                    .append("%")
                    .append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }

    public static String analyseDataReport1(Deque<String> data) {
        StringBuilder stringBuilder = new StringBuilder();

        while (data.size() != 0) {
            String timeString = data.poll();
            String activityString = data.poll();
            String resultString;
            if (data.peek() != SEPARATOR && data.peek() != null) {
                resultString = timeString + "-" + data.peek() + " " + activityString;
            } else {
                resultString = timeString + " " + activityString;
                stringBuilder.append(resultString).append(System.lineSeparator());
                data.poll();
                resultString = "";
            }
            stringBuilder.append(resultString).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }

    public static String analyseDataReport2(Deque<String> data) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Integer> sumReport = new HashMap<>();
        Map<String, Integer> lectureReport = new HashMap<>();

        while (data.size() != 0) {
            String timeString = data.poll();
            String activityString = data.poll();
            Matcher matcher = REPETITIVE_PATTERN.matcher(activityString);
            Integer timeInteger;

            if (data.peek() != SEPARATOR && data.peek() != null) {
                timeInteger = countOfMinutes(data.peek()) - countOfMinutes(timeString);
                if (matcher.find()) {
                    sumReport.merge(activityString, timeInteger, (oldValue, newValue) -> oldValue + newValue);
                } else {
                    sumReport.merge("Лекции", timeInteger, (oldValue, newValue) -> oldValue + newValue);
                    lectureReport.merge(activityString, timeInteger, (oldValue, newValue) -> oldValue + newValue);
                }
            } else {
                data.poll();
                stringBuilder.append(mapToString(sumReport))
                        .append(System.lineSeparator())
                        .append(mapToString(lectureReport))
                        .append(System.lineSeparator());
                sumReport.clear();
                lectureReport.clear();
            }
        }

        return stringBuilder.toString();
    }
}
