package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users){
        return users.stream()
                .filter(man -> man.get("gender").equals("male"))
                .sorted((dob1, dob2) -> dob1.get("birthday").compareTo(dob2.get("birthday")))
                .map(man -> man.get("name"))
                .collect(Collectors.toList());
    }
}
// END
