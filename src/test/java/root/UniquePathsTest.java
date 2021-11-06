package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UniquePathsTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(3, 7, 28),
                Arguments.of(5, 7, 210),
                Arguments.of(2, 2, 2),
                Arguments.of(3, 3, 6),
                Arguments.of(5, 3, 15));
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkUniquePaths(int m, int n, int expected){
        int actual = UniquePaths.uniquePathsV2(m, n);

        Assert.assertEquals(expected, actual);
    }

}
