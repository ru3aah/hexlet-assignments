package exercise;

// BEGIN
@lombok.AllArgsConstructor
@lombok.Value
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
