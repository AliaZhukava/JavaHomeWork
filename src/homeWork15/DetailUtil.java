package homeWork15;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DetailUtil {

    private static final int INCREMENT = 1;
    private static final int DETAILS_COUNT = 9;
    private static final int FIRST_NIGHT_DETAILS = 20;
    private static Random random = new Random();

    private DetailUtil() {
    }

    public static Map<Detail, Integer> createDetailsMap() {
        Map<Detail, Integer> detailsMap = new LinkedHashMap<>();
        detailsMap.put(Detail.Head, 0);
        detailsMap.put(Detail.Body, 0);
        detailsMap.put(Detail.LeftHand, 0);
        detailsMap.put(Detail.RightHand, 0);
        detailsMap.put(Detail.LeftLeg, 0);
        detailsMap.put(Detail.RightLeg, 0);
        detailsMap.put(Detail.Cpu, 0);
        detailsMap.put(Detail.Hdd, 0);
        detailsMap.put(Detail.Ram, 0);

        return detailsMap;
    }

    public static Map<Detail, Integer> dump() {
        Map<Detail, Integer> detailsMap = createDetailsMap();

        for (int i = 1; i <= FIRST_NIGHT_DETAILS; i++) {
            detailsMap = createDetail(detailsMap);
        }

        return detailsMap;
    }

    public static Map<Detail, Integer> createDetail(Map<Detail, Integer> detailsMap) {
        Set<Detail> keySet = detailsMap.keySet();
        List<Detail> keys = new ArrayList<>(keySet);
        keySet.toArray(new Detail[keySet.size()]);
        detailsMap.merge(keys.get(random.nextInt(DETAILS_COUNT)), INCREMENT, (value, newValue) -> value + newValue);

        return detailsMap;
    }
}
