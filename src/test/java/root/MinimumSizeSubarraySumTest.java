package root;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;

public class MinimumSizeSubarraySumTest {

	public static Collection initData(){

		return asList(
				Arguments.of(new int []{2, 3, 1, 2, 4, 3}, 7, 2)
		);
	}

	@ParameterizedTest
	@MethodSource("initData")
	public void checkMinSubArrayLen(int [] nums, int target, int expected){
		int actual = MinimumSizeSubarraySum.minSubArrayLen(target, nums);

		Assertions.assertEquals(expected, actual);
	}
}
