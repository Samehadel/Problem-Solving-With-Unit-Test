package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class ValidParenthesesTest {
    public static Collection initData(){

        return Arrays.asList(
                Arguments.of("{}(]", false),
                Arguments.of("[{()}]", true),
                Arguments.of(")", false),
                Arguments.of(")(){}", false),
                Arguments.of("()(){}", true)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkValidParentheses(String input, boolean expected){
        boolean actual = ValidParentheses.isValid(input);

        Assert.assertEquals(expected, actual);
    }
}
