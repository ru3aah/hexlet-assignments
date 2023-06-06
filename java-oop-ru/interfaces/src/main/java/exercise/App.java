package exercise;

import java.lang.reflect.AnnotatedParameterizedType;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static List<String> buildApartmentsList(List<Home> apartments, int n) {


        return apartments.stream()
                .sorted(Home::compareTo)
                .limit(n)
                .map(Home::toString)
                .toList();
    }
}
// END
