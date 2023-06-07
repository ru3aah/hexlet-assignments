package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap();
        Set<Entry<String, String>> entries = data.entrySet();
        entries.forEach(entry -> storage.unset(entry.getKey()));
        entries.forEach(entry -> storage.set(entry.getValue(), entry.getKey()));
    }
}
// END
