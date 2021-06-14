package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class ContainerWithMostWaterTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(new int []{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int []{1, 1}, 1),
                Arguments.of(new int []{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int []{1, 2, 1}, 2),
                Arguments.of(new int []{2, 2, 2}, 4),
                Arguments.of(new int []{3, 2, 6}, 6),
                Arguments.of(new int []{2, 2, 2, 2, 3}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkContainerWithMostWater(int [] nums, int expected){
        int actual = ContainerWithMostWater.maxArea(nums);

        Assert.assertEquals(expected, actual);
    }

}
