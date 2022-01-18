package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class ReverseVowelsOfAStringTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("hello", "holle"),
                Arguments.of("leetcode", "leotcede"),
                Arguments.of("sa", "sa"),
                Arguments.of("ea", "ae"),
                Arguments.of("Aa", "aA"),
                Arguments.of("sameh", "semah")
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkreverseVowels(String s, String expected){
        String actual = ReverseVowelsOfAString.reverseVowels(s);

        Assert.assertEquals(expected, actual);
    }
}
