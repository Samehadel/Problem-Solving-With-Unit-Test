package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RemoveDuplicatesTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(new int [] {1, 5, 5, 5, 10, 12, 12, 15, 15}, 5),
                Arguments.of(new int [] {1, 5, 10, 12, 15}, 5),
                Arguments.of(new int [] {1, 1}, 1),
                Arguments.of(new int [] {1, 1, 1, 1, 1}, 1),
                Arguments.of(new int [] {1, 1, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkRemoveDuplicates(int [] nums, int expected){
        int actual = RemoveDuplicates.removeDuplicates(nums);

        Assert.assertEquals(expected, actual);
    }
}
