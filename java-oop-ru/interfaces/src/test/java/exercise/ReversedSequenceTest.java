package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {
    @Test
    public void testReversedSequence() {
        var string = "abcdef";
        var expected = "fedcba";
        var rs = new ReversedSequence(string);
        var actual = rs.toString();

        assertEquals(expected, actual);
    }
}