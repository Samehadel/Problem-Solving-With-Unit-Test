package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class RomanToIntegerTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("XM", 1010),
                Arguments.of("MCMIV", 1904),
                Arguments.of("IX", 9)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkRomanToInteger(String s, int expected){
        int actual = RomanToInteger.romanToInt(s);

        Assert.assertEquals(expected, actual);
    }
}
