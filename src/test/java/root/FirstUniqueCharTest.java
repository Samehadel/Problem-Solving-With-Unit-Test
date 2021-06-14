package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class FirstUniqueCharTest {
    public static Collection initData(){

        return Arrays.asList(
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2),
                Arguments.of("dddccdbba", 8),
                Arguments.of("aabbca", 4),
                Arguments.of("lesisessl", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkFirstUniqueChar(String input, int expected){
        int actual = FirstUniqueChar.findFirstUniqueChar(input);

        Assert.assertEquals(expected, actual);
    }
}
