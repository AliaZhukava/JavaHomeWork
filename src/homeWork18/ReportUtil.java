package homeWork18;

import java.nio.file.Path;
import java.util.Deque;

public class ReportUtil {

    private ReportUtil() {
    }

    public static void composeReport1(Path sourcePath, Path resultPath) {
        Deque<String> data = ManagerUtil.readFile(sourcePath);
        String formattedData = AnalyzerUtil.analyseDataReport1(data);
        ManagerUtil.writeFile(resultPath, formattedData);
    }

    public static void composeReport2(Path sourcePath, Path resultPath) {
        Deque<String> data = ManagerUtil.readFile(sourcePath);
        String formattedData = AnalyzerUtil.analyseDataReport2(data);
        ManagerUtil.writeFile(resultPath, formattedData);
    }
}
