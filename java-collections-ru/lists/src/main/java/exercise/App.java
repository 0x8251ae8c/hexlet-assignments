package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        List<String> symbolsArray = new ArrayList<>(List.of(symbols.split("")));
        List<String> wordCharsArray = new ArrayList<>(List.of(word.toLowerCase().split("")));

        for (var char_ : wordCharsArray) {
            if (symbolsArray.contains(char_)) {
                symbolsArray.remove(char_);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
