package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage data) {
        var temp =  new InMemoryKV(data.toMap());

        for (var key : temp.toMap().keySet()) {
            var value = data.get(key, "");
            data.unset(key);
            data.set(value, key);
        }
    }
}
// END
