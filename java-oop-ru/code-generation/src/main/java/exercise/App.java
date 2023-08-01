package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;


// BEGIN
class App{
    @lombok.SneakyThrows
    public static void save(Path filePath, Car car){
        Files.writeString(filePath.toAbsolutePath().normalize(),
                Car.serialize(car), CREATE);
    }
    @lombok.SneakyThrows
    public static Car extract(Path filePath) {
        return new ObjectMapper().readValue(filePath.toAbsolutePath().normalize().toFile(), Car.class);
    }
}
// END
