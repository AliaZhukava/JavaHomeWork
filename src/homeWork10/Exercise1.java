package homeWork10;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {

        String str = "Each year fewer people speak English as their mother tongue but more people speak it as a second or foreign language";

        Map<String, Integer> map = new HashMap<>();
        for (String s : str.split(" ")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        map.remove("");
        System.out.println(map);
    }
}

