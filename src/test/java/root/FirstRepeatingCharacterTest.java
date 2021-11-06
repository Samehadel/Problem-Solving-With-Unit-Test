package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class FirstRepeatingCharacterTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of("character", 'a'),
                Arguments.of("Sameh Adel", 'a'),
                Arguments.of("dumpled", 'd'),
                Arguments.of("Current", 'r'),
                Arguments.of("Hhooldd", 'h')
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkFirstRepeatingCharacterTest(String word, char expected){
        char actual = FirstRepeatingCharacter.firstRepeatingCharacter(word);

        Assert.assertEquals(expected, actual);
    }
}
