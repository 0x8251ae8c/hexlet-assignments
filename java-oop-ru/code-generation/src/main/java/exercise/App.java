package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        try {
            Files.write(path, car.serialize().getBytes(), StandardOpenOption.CREATE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Car extract(Path path) {
        try {
            return Car.extract(new String(Files.readAllBytes(path)));
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
// END
