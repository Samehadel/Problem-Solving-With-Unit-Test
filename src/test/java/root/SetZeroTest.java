package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class SetZeroTest {
	public static Collection initData(){
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];
		a[0][0] = 1; a[0][1] = 1; a[0][2] = 1;

		a[1][0] = 1; a[1][1] = 0; a[1][2] = 1;

		a[2][0] = 1; a[2][1] = 1; a[2][2] = 1;

		return asList(
				Arguments.of(a, a)
		);
	}

	@ParameterizedTest
	@MethodSource("initData")
	public void checkRotateArray(int [][] nums, int [][] expected){
		SetZeros.setZeroes(nums);

		//ssert.assertArrayEquals(expected, actual);
	}
}
