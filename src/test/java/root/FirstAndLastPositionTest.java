package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class FirstAndLastPositionTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(new int[]{5, 6, 8, 10, 12, 12}, 12, new int []{4, 5}),
                Arguments.of(new int[]{10}, 10, new int []{0, 0}),
                Arguments.of(new int[]{1}, 10, new int []{-1, -1}),
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 8, new int []{3, 4}),
                Arguments.of(new int[]{5, 7, 7, 8, 10}, 8, new int []{3, 3}),
                Arguments.of(new int[]{15, 15, 15, 20, 21, 23}, 15, new int []{0, 2}),
                Arguments.of(new int[]{15, 15, 15, 20, 20, 21, 23, 25}, 20, new int []{3, 4}),
                Arguments.of(new int[]{150, 152, 152, 200, 201, 203}, 152, new int []{1, 2}),
                Arguments.of(new int[]{150, 152, 152, 200, 201, 203}, 203, new int []{5, 5}),
                Arguments.of(new int[]{150, 152, 152, 200, 201, 203}, 1502, new int []{-1, -1}),
                Arguments.of(new int[]{}, 0, new int []{-1, -1}),
                Arguments.of(new int[]{0, 0, 0, 0}, 0, new int []{0, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkFirstAndLastPositionTest(int [] nums, int target, int [] expected){
        int [] actual = FirstAndLastPosition.searchRange(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }
}
