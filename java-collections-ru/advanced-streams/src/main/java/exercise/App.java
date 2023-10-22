package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        var lines = content.split("\n");
        var vars = Arrays.stream(lines)
                .filter(x -> x.startsWith("environment"))
                .map(x -> x.substring(13, x.length() - 1))
                .flatMap(x -> Arrays.stream(x.split(",")))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.substring(12))
                .toArray(String[]::new);
        return String.join(",", vars);
    }
}
//END
