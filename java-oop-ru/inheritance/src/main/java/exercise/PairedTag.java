package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> atributes, String body, List<Tag> children) {
        super(name, atributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        var string = "<" + name;
        for (var atribute : atributes.entrySet()) {
            string += " " + atribute.getKey() + "=\"" + atribute.getValue() + "\"";
        }
        string += ">";
        for (var child : children) {
            string += child.toString();
        }
        string += body + "</" + name + ">";
        return string;
    }
}
// END
