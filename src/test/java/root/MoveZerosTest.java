package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;

public class MoveZerosTest {

    public static Collection initData(){
        return asList(
                Arguments.of(new int []{1, 0, 6, 0, 3, 7}, new int []{1, 6, 3, 7, 0, 0}),
                Arguments.of(new int []{10, 5}, new int []{10, 5}),
                Arguments.of(new int []{0, 2, 3, 4, 5, 6, 0}, new int []{2, 3, 4, 5, 6, 0, 0}),
                Arguments.of(new int []{0, 0, 0, 1}, new int []{1, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkMoveZeros(int [] nums, int [] expected){
        int [] actual = MoveZeroes.moveZeroes(nums);

        Assert.assertArrayEquals(expected, actual);
    }

}
