import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProgramTest {

    @Test
    void testLargestValue() {
        assertEquals(9, NumberProgram.findResult(new int[]{3, 7, 2, 9, 4}));
    }

    @Test
    void testNegativeValues() {
        assertEquals(-2, NumberProgram.findResult(new int[]{-8, -2, -5}));
    }
    @Test
    void testSingleValue() {
        assertEquals(5, NumberProgram.findResult(new int[]{5}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(Integer.MIN_VALUE, NumberProgram.findResult(new int[]{}));
    }
}

