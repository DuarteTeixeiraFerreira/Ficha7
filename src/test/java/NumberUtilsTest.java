import static org.junit.jupiter.api.Assertions.*;

import org.example.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class NumberUtilsTest {
    private NumberUtils utils = new NumberUtils();
    @ParameterizedTest
    @CsvSource({"3", "23", "311", "487", "653", "947"})
    public void testIsPrime(int number) {
        assertTrue(utils.isPrime(number));
    }
    @ParameterizedTest
    @CsvSource({"32", "64", "2", "20", "30", "26"})
    public void testIsEven(int number) {
        assertTrue(utils.isEven(number));
    }
    @ParameterizedTest
    @CsvSource({"23, 23", "46, 23", "115, 23", "184, 23", "207, 23", "230, 23"})
    public void testIsMultiple(int number, int divisor) {
        assertTrue(utils.isMultiple(number, divisor));
    }
}
