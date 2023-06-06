package exercise;

import java.util.List;

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
