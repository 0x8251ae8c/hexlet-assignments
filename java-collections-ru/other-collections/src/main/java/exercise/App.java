package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys1 = data1.keySet();
        Set<String> keys2 = data2.keySet();

        Set<String> keys = new TreeSet<>(keys1);
        keys.addAll(keys2);

        keys.forEach(x -> {
            if (keys1.contains(x) && keys2.contains(x)) {
                result.put(x, data1.get(x).equals(data2.get(x)) ? "unchanged" : "changed");
            } else if (keys1.contains(x)) {
                result.put(x, "deleted");
            } else if (keys2.contains(x)) {
                result.put(x, "added");
            }
        });

        return result;
    }
}
//END
