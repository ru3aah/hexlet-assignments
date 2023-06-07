package exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
class InMemoryKV implements KeyValueStorage {

    private Map<String, String> data = new HashMap<>();

    InMemoryKV(Map<String, String> initial) {
        data.putAll(initial);
    }

    public void set(String key, String value) {
        data.put(key, value);
    }

    public void unset(String key) {
        data.remove(key);
    }

    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
