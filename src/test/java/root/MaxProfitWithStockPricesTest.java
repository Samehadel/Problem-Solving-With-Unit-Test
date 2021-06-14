package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MaxProfitWithStockPricesTest {
    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(Arrays.asList(10, 7, 5, 8, 11, 9), 6),
                Arguments.of(Arrays.asList(1, 7, 5, 8, 11, 9), 10),
                Arguments.of(Arrays.asList(10, 7, 5, 8, 11, 9, 1, 20), 19),
                Arguments.of(Arrays.asList(1, 1), 0),
                Arguments.of(Arrays.asList(10, 1), 0),
                Arguments.of(Arrays.asList(10, 15, 20), 10),
                Arguments.of(Arrays.asList(10, 10, 8), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkMaxProfitWithStockPrices(List<Integer> nums, int expected){
        int actual = MaxProfitWithStockPrices.getMaxProfit(nums);

        Assert.assertEquals(expected, actual);
    }
}
