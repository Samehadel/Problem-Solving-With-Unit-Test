package root;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;

public class ContainsDuplicateIITest {
	public static Collection initData(){

		return asList(
				Arguments.of(new int []{1,2,2,3}, 3, true),
				Arguments.of(new int []{1,2,3,1,2,3}, 2, false),
				Arguments.of(new int []{1, 0, 1, 1}, 1, true),
				Arguments.of(new int []{1,0,1,1}, 1, true),
				Arguments.of(new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}, 3, true),
				Arguments.of(new int []{1, 2, 3, 4, 5, 6, 7, 9, 9}, 3, true),
				Arguments.of(new int []{1}, 1, false),
				Arguments.of(new int []{1, 2, 1}, 0, false),
				Arguments.of(new int []{1, 2}, 2, false),
				Arguments.of(new int []{1, 2, 3, 1}, 3, true),
				Arguments.of(new int []{5, 2, 3, 1, 5}, 4, true),
				Arguments.of(new int []{5, 2, 3, 1, 5}, 5, true),
				Arguments.of(new int []{1, 2, 3, 1}, 0, false),
				Arguments.of(new int []{1, 2, 3, 1, 2, 3}, 2, false)
		);
	}

	@ParameterizedTest
	@MethodSource("initData")
	public void checkContainsDuplicateII(int [] nums, int k, boolean expected){
		boolean actual = ContainsDuplicateII.containsNearbyDuplicate(nums, k);

		Assertions.assertEquals(expected, actual);
	}
}
