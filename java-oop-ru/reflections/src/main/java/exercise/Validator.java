package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        List<String> nullFields = new ArrayList<>();
        try {
            for (Field f : address.getClass().getDeclaredFields()) {
                try {
                    if ((f.getAnnotation(NotNull.class).getClass()).equals(NotNull.class)) {
                        if (Objects.isNull(f.get(new Object()))) {
                            nullFields.add(f.getName());
                        }
                    }
                } catch (IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } catch (Exception e) {
            System.out.println("Smth went wrong");
        }
        return nullFields;
    }
    public static Map<String, List<String>> advanceValidate(Address address) throws IllegalAccessException {
        Map<String, List<String>> result = new HashMap<>();
        List<String> errorList = new ArrayList<>();
        for (Field f : address.getClass().getDeclaredFields()) {
            errorList.clear();
            if ((f.getAnnotation(NotNull.class).getClass()).equals(NotNull.class)) {
                if (Objects.isNull(f.get(new Object()))) {
                        errorList.add("is null");
                }
            }
            if (!f.isAccessible()) {
                    f.setAccessible(true);
            }
            String value = (String) f.get(new Object());
            if(value.length() < f.getAnnotation(MinLength.class).minLength()) {
                errorList.add("length is less than allowed minimum");
            }
            if(!errorList.isEmpty()) {
                    result.put(f.getName(), errorList);
            }
        }
        return result;
    }
}
// END
