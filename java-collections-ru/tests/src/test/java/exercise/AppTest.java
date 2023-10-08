package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result1 = App.take(numbers1, 2);
        assertThat(result1.size()).isEqualTo(2);
        assertThat(result1.get(0)).isEqualTo(1);
        assertThat(result1.get(1)).isEqualTo(2);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> result2 = App.take(numbers2, 8);
        assertThat(result2.size()).isEqualTo(3);
        assertThat(result2.get(0)).isEqualTo(7);
        assertThat(result2.get(2)).isEqualTo(10);

        List<Integer> numbers3 = new ArrayList<>();
        List<Integer> result3 = App.take(numbers3, 3);
        assertThat(result3.size()).isEqualTo(0);
        // END
    }
}
