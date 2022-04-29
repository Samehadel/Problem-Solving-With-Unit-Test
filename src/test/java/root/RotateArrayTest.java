package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class RotateArrayTest {

    public static Collection initData(){
        return asList(
                Arguments.of(new int []{1, 8, 6, 2, 3, 7}, new int []{7, 1, 8, 6, 2, 3}, 1),
                Arguments.of(new int []{10, 5}, new int []{10, 5}, 2),
                Arguments.of(new int []{1, 2, 3, 4, 5, 6, 7}, new int []{5, 6, 7, 1, 2, 3, 4}, 3),
                Arguments.of(new int []{10}, new int []{10}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkRotateArray(int [] nums, int [] expected, int k){
        int [] actual = RotateArray.rotate(nums, k);

        Assert.assertArrayEquals(expected, actual);
    }

}
