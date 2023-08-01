package exercise;

import lombok.Value;

// BEGIN
@lombok.AllArgsConstructor
@lombok.Data
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
