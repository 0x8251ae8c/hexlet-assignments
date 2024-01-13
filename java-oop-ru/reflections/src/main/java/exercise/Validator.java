package exercise;

import java.lang.reflect.Field;
import java.util.*;
// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        List<String> notValidFields = new ArrayList<String>();
        var cls = obj.getClass();
        var fields = cls.getDeclaredFields();

        for (var field : fields) {
            if (field.getAnnotation(NotNull.class) != null) {
                try {
                    field.setAccessible(true);
                    if ((String) field.get(obj) == null) {
                        notValidFields.add(field.getName());
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return notValidFields;
    }
}
// END
