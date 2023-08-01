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

    public static String serialize(Car car)
            throws com.fasterxml.jackson.core.JsonProcessingException {
        return new ObjectMapper().writeValueAsString(car);
    }

    public static Car unserialize(String carJson) throws java.io.IOException {
        return new ObjectMapper().readValue(carJson, Car.class);
    }
}
    // END

