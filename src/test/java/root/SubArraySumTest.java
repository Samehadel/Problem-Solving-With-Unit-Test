package root;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;

public class SubArraySumTest {
	public static Collection initData(){

		return asList(
				/*Arguments.of(new int []{1, 0, 1, 1, 1, 0, 0, 1}, 6),
				Arguments.of(new int []{1, 1, 1, 1, 1, 1, 0, 1}, 2),*/
				Arguments.of(new int []{1, 1, 1}, 2, 2),
				Arguments.of(new int []{1, 2, 3}, 3, 2),
				Arguments.of(new int []{1, 1, 1, -1, 0, -2, 1, 1}, 0, 8)
		);
	}

	@ParameterizedTest
	@MethodSource("initData")
	public void checkSubArraySum(int [] nums, int k, int expected){

		int actual = SubArraySum.subarraySum(nums, k);

		Assertions.assertEquals(expected, actual);
	}

}
