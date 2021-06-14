package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CafeOrderCheckerTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(1, 2, 3, 4, 5, 6)), true),
                Arguments.of(Arrays.asList(Arrays.asList(1, 10, 7), Arrays.asList(18, 5, 16), Arrays.asList(1, 18, 10, 7, 5, 16)), true),
                Arguments.of(Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4, 6), Arrays.asList(1, 2, 4, 6, 5, 3)), false)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkCafeOrder(List<List<Integer>> arrays, boolean expected){
        boolean actual = CafeOrderChecker.checkOrders(arrays.get(0), arrays.get(1), arrays.get(2));

        Assert.assertEquals(expected, actual);
    }
}
