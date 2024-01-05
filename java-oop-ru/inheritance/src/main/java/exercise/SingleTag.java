package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> atributes) {
        super(name, atributes);
    }

    @Override
    public String toString() {
        var string = "<" + name;
        for (var atribute : atributes.entrySet()) {
            string += " " + atribute.getKey() + "=\"" + atribute.getValue() + "\"";
        }
        string += ">";
        return string;
    }
}
// END
