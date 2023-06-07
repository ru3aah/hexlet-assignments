package exercise;

// BEGIN
import java.util.Map;

class FileKV implements KeyValueStorage {

    private String filepath;

    FileKV(String filepath, Map<String, String> initial) {
        this.filepath = filepath;
        initial.entrySet().stream().forEach(entry -> set(entry.getKey(), entry.getValue()));
    }

    public void set(String key, String value) {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        data.put(key, value);
        Utils.writeFile(filepath, Utils.serialize(data));
    }

    public void unset(String key) {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        data.remove(key);
        Utils.writeFile(filepath, Utils.serialize(data));
    }

    public String get(String key, String defaultValue) {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        return data.containsKey(key) ? data.get(key) : defaultValue;
    }

    public Map<String, String> toMap() {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        return data;
    }
}
// END
