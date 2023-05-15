package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {

    public static Map<String, String> genDiff(Map<String, Object> list1, Map<String, Object> list2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(list1.keySet());
        keys.addAll(list22.keySet());

        for (String key: keys) {
            if (!list1.containsKey(key)) {
                result.put(key, "added");
            } else if (!list2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (list1.get(key).equals(list2.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        return result;

    }
}
//END
