package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static List<String> buildAppartmentsList(List<Home> apartments, int n) {


        return apartments.stream()
                .sorted(apartments -> apartments.getArea())
                .limit(n)
                .forEach(apartments -> apartments.toString())
                .collect(Collectors.toList());
    }
}
// END
