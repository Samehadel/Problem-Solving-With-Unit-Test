package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class FindRotationPointTest {

    public static Collection initData(){

        return Arrays.asList(
                Arguments.of(new int[]{100, 110, 120, 130, 140, 10, 20}, 5),
                Arguments.of(new int[]{100, 110, 120, 130, 140, 5, 10, 20}, 5),
                Arguments.of(new int[]{100, 110, 120, 130, 140, 150, 160, 20}, 7),
                Arguments.of(new int[]{100, 110, 120, 130, 140, 150, 20}, 6),
                Arguments.of(new int[]{100, 200, 50, 60, 70}, 2),
                Arguments.of(new int[]{10, 11, 12, 13, 2, 3}, 4),
                Arguments.of(new int[]{20, 10, 12, 15}, 1),
                Arguments.of(new int[]{2, 3, 1}, 2),
                Arguments.of(new int[]{3, 1, 2}, 1),
                Arguments.of(new int[]{2, 0}, 1),
                Arguments.of(new int[]{2, 0, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkFindRotationPoint(int [] input, int expected){
        int actual = FindRotationPoint.findRotationPoint(input);

        Assert.assertEquals(expected, actual);
    }
}
