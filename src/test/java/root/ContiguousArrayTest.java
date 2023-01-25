package root;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;

public class ContiguousArrayTest {
	public static Collection initData(){

		return asList(
				/*Arguments.of(new int []{1, 0, 1, 1, 1, 0, 0, 1}, 6),
				Arguments.of(new int []{1, 1, 1, 1, 1, 1, 0, 1}, 2),
				Arguments.of(new int []{1, 0, 1}, 2),*/
				Arguments.of(new int []{0, 0, 1, 0, 0, 0, 1, 1}, 6),
				Arguments.of(new int []{0, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 10),
				Arguments.of(new int []{0, 1}, 2),
				Arguments.of(new int []{0,1,1,0,1,1,1,0}, 4),
				Arguments.of(new int []{0, 1, 1, 1, 0, 1, 1, 0}, 4)
		);
	}

	@ParameterizedTest
	@MethodSource("initData")
	public void checkSearchMatrix(int [] nums, int expected){
		int actual = ContiguousArray.findMaxLength(nums);

		Assertions.assertEquals(expected, actual);
	}
}
