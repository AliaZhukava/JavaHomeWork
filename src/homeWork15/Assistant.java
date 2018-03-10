package homeWork15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Assistant extends Thread {

    private final Integer DECREMENT = -1;
    private static final Integer INCREMENT = 1;
    private final int MAX_DETAILS_COUNT = 4;
    private final Map<Detail, Integer> dumpDetails;
    private Map<Detail, Integer> assistantDetails = DetailUtil.createDetailsMap();
    private final Random random = new Random();
    private int sumDetails;

    private Assistant(Map<Detail, Integer> dumpDetails, String name) {
        this.dumpDetails = dumpDetails;
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            getRandomCountOfDetails();
            synchronized (dumpDetails) {
                try {
                    dumpDetails.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void getDetail() {
        Map<Detail, Integer> availableDetailsMap = new HashMap<>();
        Set<Detail> keySet;
        List<Detail> keys;
        Detail detail;

        synchronized (dumpDetails) {
            final int detailsOnDump = dumpDetails.values()
                    .stream()
                    .mapToInt(Number::intValue)
                    .sum();
            if (detailsOnDump != 0) {
                for (Map.Entry<Detail, Integer> entry : dumpDetails.entrySet()) {
                    if (entry.getValue() != 0) {
                        availableDetailsMap.put(entry.getKey(), entry.getValue());
                    }
                }

                keySet = availableDetailsMap.keySet();
                keys = new ArrayList<>(keySet);
                detail = keys.get(random.nextInt(availableDetailsMap.size()));

                assistantDetails.merge(detail, INCREMENT, (value, newValue) -> value + newValue);
                dumpDetails.merge(detail, DECREMENT, (value, newValue) -> value + newValue);
                sumDetails++;
            }
        }
    }

    private void getRandomCountOfDetails() {
        int countOfDetails = random.nextInt(MAX_DETAILS_COUNT) + 1;
        System.out.println(Thread.currentThread().getName() + " ассистент взял " + countOfDetails + " деталей.");
        for (int i = 1; i <= countOfDetails; i++) {
            getDetail();
        }
    }

    public int totalRobotsCount() {
        return assistantDetails.values()
                .stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
    }

    public void result() {
        System.out.println(getName() + " всего деталей - " + sumDetails);
        System.out.println(getName() + " детали " + assistantDetails.toString());
        System.out.println(getName() + " всего роботов - " + totalRobotsCount());
    }
}
