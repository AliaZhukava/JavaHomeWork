package homeWork18;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RegexDemo {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("src", "homeWork18", "course.txt");
        Path report1Path = Paths.get("src", "homeWork18", "report1.txt");
        Path report2Path = Paths.get("src", "homeWork18", "report2.txt");

        ReportUtil.composeReport1(sourcePath, report1Path);
        ReportUtil.composeReport2(sourcePath, report2Path);
    }
}
