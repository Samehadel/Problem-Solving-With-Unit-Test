package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class LongestPalindromicSubstringTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("babadd", "bab"),
                Arguments.of("a", "a"),
                Arguments.of("daaaddc", "daaad"),
                Arguments.of("cababac", "cababac"),
                Arguments.of("aacccdd", "ccc"),
                Arguments.of("ac", "a"),
                Arguments.of("bdkaca", "aca"),
                Arguments.of("caoacksss", "caoac")
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkLongestPalindromicSubstring(String s, String expected){
        String actual = LongestPalindromicSubstring.longestPalindrome(s);

        Assert.assertEquals(expected, actual);
    }
}
