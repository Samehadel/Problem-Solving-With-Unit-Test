package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class PermutationPalindromeTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("ivicc", true),
                Arguments.of("civic", true),
                Arguments.of("civil", false),
                Arguments.of("livci", false),
                Arguments.of("", true),
                Arguments.of("acac", true)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkPermutationPalindrome(String input, boolean expected){
        boolean actual = PermutationPalindrome.checkPermutationPalindrome(input);

        Assert.assertEquals(expected, actual);
    }
}
