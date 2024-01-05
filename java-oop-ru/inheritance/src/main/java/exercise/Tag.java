package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    protected String name;
    protected Map<String, String> atributes;

    public Tag(String name, Map<String, String> atributes) {
        this.name = name;
        this.atributes = atributes;
    }

    public abstract String toString();
}
// END
