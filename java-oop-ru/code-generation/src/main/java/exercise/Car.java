package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Value;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @lombok.SneakyThrows
    public static String serialize(Car car) {
        return new ObjectMapper().writeValueAsString(car);
    }

    @lombok.SneakyThrows
    public static Car unserialize(String carJson) {
        return new ObjectMapper().readValue(carJson, Car.class);
        }
}
    // END

