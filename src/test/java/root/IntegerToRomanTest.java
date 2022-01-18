package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class IntegerToRomanTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(3, "III"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV"),
                Arguments.of(1995, "MVM")
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkIntegerToRoman(int num, String expected){
        String actual = IntegerToRoman.intToRoman(num);

        Assert.assertEquals(expected, actual);
    }
}
