package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        return apartments.stream()
                .sorted((a1, a2) -> a1.compareTo(a2))
                .map(x -> x.toString())
                .limit(n)
                .collect(Collectors.toList());
    }
}
// END
