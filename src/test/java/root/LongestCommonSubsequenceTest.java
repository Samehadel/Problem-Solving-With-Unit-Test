package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class LongestCommonSubsequenceTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("fosh", "fort", 2),
                Arguments.of("sameh", "sareeh", 4),
                Arguments.of("fosh", "fish", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkLongestCommonSubsequenceTest(String wordA, String wordB, int expected){
        int actual = LongestCommonSubsequence.longestCommonSubsequence(wordA, wordB);

        Assert.assertEquals(expected, actual);
    }
}
