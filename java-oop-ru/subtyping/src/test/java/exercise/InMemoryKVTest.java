package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Map;
import java.util.HashMap;


class InMemoryKVTest {

    @Test
    void inMemoryKVTest() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
        assertThat(storage.get("key2", "default")).isEqualTo("default");
        assertThat(storage.get("key", "default")).isEqualTo("10");

        storage.set("key2", "value2");
        storage.set("key", "value");

        assertThat(storage.get("key2", "default")).isEqualTo("value2");
        assertThat(storage.get("key", "default")).isEqualTo("value");

        storage.unset("key");
        assertThat(storage.get("key", "def")).isEqualTo("def");
        assertThat(storage.toMap()).isEqualTo(Map.of("key2", "value2"));

    }

    @Test
    void mustBeImmutableTest() {
        Map<String, String> initial = new HashMap<>();
        initial.put("key", "10");

        Map<String, String> clonedInitial = new HashMap<>();
        clonedInitial.putAll(initial);

        KeyValueStorage storage = new InMemoryKV(initial);

        initial.put("key2", "value2");
        assertThat(storage.toMap()).isEqualTo(clonedInitial);

        Map<String, String> map = storage.toMap();
        map.put("key2", "value2");
        assertThat(storage.toMap()).isEqualTo(clonedInitial);
    }

    @Test
    void fileKVTest() {
        KeyValueStorage storage = new FileKV("src/test/resources/file", Map.of("key", "value"));
        assertThat(storage.get("key2", "default")).isEqualTo("default");
        assertThat(storage.get("key", "default")).isEqualTo("value");

        storage.set("key3", "value3");
        storage.set("key", "10");
        assertThat(storage.get("key3", "default")).isEqualTo("value3");
        assertThat(storage.get("key", "default")).isEqualTo("10");

        storage.unset("key");
        assertThat(storage.get("key", "def")).isEqualTo("def");

        assertThat(storage.toMap()).isEqualTo(Map.of("key3", "value3"));
    }
}
