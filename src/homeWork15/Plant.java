package homeWork15;

import java.util.Map;
import java.util.Random;

public class Plant extends Thread{

    private static final int MAX_DETAILS_COUNT = 4;
    private static Random random = new Random();
    private Map<Detail, Integer> dumpDetails;

    private Plant (Map<Detail, Integer> dampDetails) {
        this.dumpDetails = dampDetails;
    }

    @Override
    public void run() {
        while (true) {
            throwOutDetails();

            synchronized (dumpDetails) {
                try {
                    dumpDetails.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void throwOutDetails() {
        int countOfDetails = random.nextInt(MAX_DETAILS_COUNT) + 1;
        System.out.println(Thread.currentThread().getName() + " С фабрики выбросили " + countOfDetails + " деталей");
        for (int i = 1; i <= countOfDetails; i++) {
            synchronized (dumpDetails) {
                dumpDetails = DetailUtil.createDetail(dumpDetails);
            }
        }
    }
}
