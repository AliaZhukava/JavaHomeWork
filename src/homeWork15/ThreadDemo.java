package homeWork15;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ThreadDemo {

    public static void main(String[] args) {
        Map<Detail, Integer> dumpDetails = new LinkedHashMap<>(DetailUtil.dump());
        Assistant whiteAssistant = new Assistant(dumpDetails, "Белый ученый");
        Assistant blackAssistant = new Assistant(dumpDetails, "Черный ученый");
        List<Thread> players = Arrays.asList(whiteAssistant, blackAssistant, new Plant(dumpDetails));

        for (Thread player : players) {
            player.setDaemon(true);
            player.start();
        }

        for (int i = 1; i <= WinnerUtil.COUNT_OF_NIGHTS; i++) {
            System.out.println("Ночь " + i);
            synchronized (dumpDetails) {
                if (i != 1) {
                    dumpDetails.notifyAll();
                }
            }
            try {
                Thread.sleep(WinnerUtil.LENGTH_OF_NIGHT);
                synchronized (dumpDetails) {
                    if (i == 1) {
                        dumpDetails.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        whiteAssistant.result();
        blackAssistant.result();
        WinnerUtil.declareWinner(whiteAssistant, blackAssistant);
    }
}
