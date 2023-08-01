package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;


// BEGIN
class App {

    public static void save(Path filePath, Car car)
            throws java.io.IOException {
        Files.writeString(filePath.toAbsolutePath().normalize(),
                Car.serialize(car), CREATE);
    }
    public static Car extract(Path filePath) throws java.io.IOException {
        return new ObjectMapper().readValue(filePath.toAbsolutePath().normalize().toFile(), Car.class);
    }
}
// END
