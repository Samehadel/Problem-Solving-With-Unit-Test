package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ProductOfAllOtherTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(new int[]{1, 2, 6, 5, 9}, new int []{540, 270, 90, 108, 60}),
                Arguments.of(new int[]{8, 2, 4, 3, 1, 5}, new int []{120, 480, 240, 320, 960, 192}),
                Arguments.of(new int[]{6, 2, 0, 3}, new int []{0, 0, 36, 0}),
                Arguments.of(new int[]{4, 0, 9, 1, 0}, new int []{0, 0, 0, 0, 0}),
                Arguments.of(new int[]{-3, 8, 4}, new int []{32, -12, -24}),
                Arguments.of(new int[]{-7, -1, -4, -2}, new int []{-8, -56, -14, -28})
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkProductOfAllOtherTest(int [] intArray, int [] expected){
        int [] actual = ProductOfAllOther.getProductsOfAllIntsExceptAtIndex(intArray);

        Assert.assertArrayEquals(expected, actual);
    }

}
