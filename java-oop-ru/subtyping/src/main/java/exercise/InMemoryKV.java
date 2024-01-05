package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    private Map<String, String> data;

    public InMemoryKV() {
        this.data = new HashMap<String, String>();
    }

    public InMemoryKV(Map<String, String> data) {
        this.data = new HashMap<String, String>(data);
    }

    public void set(String key, String value) {
        this.data.put(key, value);
    }

    public void unset(String key) {
        this.data.remove(key);
    }

    public String get(String key, String defaultValue) {
        return this.data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<String, String>(this.data);
    }
}
// END
