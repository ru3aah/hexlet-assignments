package exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.lang.reflect.Field;

class Validator {

    public static List<String> validate(Object instance) {
        List<Field> fields = List.of(instance.getClass().getDeclaredFields());
        return fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);
                        value = field.get(instance);
                        field.setAccessible(false);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .collect(Collectors.toList());
    }

    public static Map<String, List<String>> advancedValidate(Object instance) {
        List<Field> fields = List.of(instance.getClass().getDeclaredFields());
        Map<String, List<String>> validationErrors = new HashMap<>();
        fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class) || field.isAnnotationPresent(MinLength.class))
                .forEach(field -> {
                    String fieldName = field.getName();
                    List<String> errors = getErrorsForField(field, instance);
                    if (!errors.isEmpty()) {
                        validationErrors.put(fieldName, errors);
                    }
                });
        return validationErrors;
    }

    public static List<String> getErrorsForField(Field field, Object instance) {
        List<String> errors = new ArrayList<>();
        String value;

        try {
            field.setAccessible(true);
            value = (String) field.get(instance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (field.isAnnotationPresent(NotNull.class) && value == null) {
            errors.add("can not be null");
        }

        if (field.isAnnotationPresent(MinLength.class)) {
            int minLength = field.getAnnotation(MinLength.class).minLength();
            if (value == null || value.length() < minLength) {
                errors.add("length less than " + minLength);
            }
        }
        return errors;
    }
}
// END
