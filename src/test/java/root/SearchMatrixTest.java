package root;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;

public class SearchMatrixTest {
	public static Collection initData(){
		int [][] a = new int[4][4];

		a[0][0] = 1; a[0][1] = 3; a[0][2] = 5; a[0][3] = 7;

		a[1][0] = 10; a[1][1] = 11; a[1][2] = 16; a[1][3] = 20;

		a[2][0] = 23; a[2][1] = 30; a[2][2] = 34; a[2][3] = 60;

		a[3][0] = 65; a[3][1] = 100; a[3][2] = 150; a[3][3] = 250;
/*
		int [][] a = new int[1][2];

		a[0][0] = 1; a[0][1] = 3;*/

		return asList(
				Arguments.of(a, 11, true)
		);
	}

	@ParameterizedTest
	@MethodSource("initData")
	public void checkSearchMatrix(int [][] nums, int target, boolean expected){
		boolean actual = SearchMatrix.searchMatrix(nums, target);

		Assertions.assertEquals(expected, actual);
		int [] a = new int[]{2, 4, 7, 5, 3, 5, 8, 5, 1, 7};
		System.out.println(solution(a, 4, 10));
	}

	int solution(int[] a, int m, int k) {
		int count = 0;

		for(int index = 0; index < (a.length - m + 1); index ++){
			count += countInSubArray(a, index, index + m, k);
		}

		return count;
	}


	int countInSubArray(int [] a, int low, int high, int k){
		int count = 0;
		for(int i = low; i < high; i++){
			for(int j = i; j < high; j++){
				if(i != j && a[i] + a[j] == k ){
					count ++;
				}
			}
		}

		return count;
	}

}
