package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class HighestProductOfThreeTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(Arrays.asList(1, 2, 3, 4), 24),
                Arguments.of(Arrays.asList(6, 1, 3, 5, 7, 8, 2), 336),
                Arguments.of(Arrays.asList(-5, 4, 8, 2, 3), 96)/*,
                Arguments.of(Arrays.asList(-10, 1, 3, 2, -10), 300),
                Arguments.of(Arrays.asList(-5, -1, -3, -2), -6)*/
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkHighestProductOfThree(List<Integer> nums, int expected){
        int actual = HighestProductOfThree.highestProductOf3(nums);

        Assert.assertEquals(expected, actual);
    }
}
