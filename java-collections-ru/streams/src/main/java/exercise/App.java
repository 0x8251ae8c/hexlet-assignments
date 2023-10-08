package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return emails.stream()
                .filter(email -> freeDomains.contains(getDomain(email)))
                .count();
    }

    private static String getDomain(String email) {
        return email.toLowerCase().split("@")[1];
    }
}
// END
