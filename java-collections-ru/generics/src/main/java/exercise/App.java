package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> map) {
        List<Map<String, String>> mappedBooks = new ArrayList<>();

        for (var book : books) {
            if (checkEntry(book, map)) {
                mappedBooks.add(book);
            }
        }

        return mappedBooks;
    }

    private static boolean checkEntry(Map<String, String> book, Map<String, String> map) {
        for (Map.Entry<String, String> entry: map.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
            if (!book.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }
}
//END
