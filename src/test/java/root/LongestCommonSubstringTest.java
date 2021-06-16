package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class LongestCommonSubstringTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("fish", "hish", 3),
                Arguments.of("vista", "hish", 2),
                Arguments.of("street", "yareet", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkLongestCommonSubstring(String wordA, String wordB, int expected){
        int actual = LongestCommonSubstring.longestCommonSubstring(wordA, wordB);

        Assert.assertEquals(expected, actual);
    }
}
