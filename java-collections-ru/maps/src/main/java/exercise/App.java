package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        if (!sentence.equals("")) {
            for (String word : sentence.split(" ")) {
                int value = map.containsKey(word) ? map.get(word) + 1 : 1;
                map.put(word, value);
            }
        }

        return map;
    }

    public static String toString(Map map) {
        List<String> list = new ArrayList<>();

        for (var key : map.keySet()) {
            list.add("  " + key + ": " + map.get(key));
        }

        return list.isEmpty() ? "{}" : "{\n" + String.join("\n", list) + "\n}";
    }
}
//END
