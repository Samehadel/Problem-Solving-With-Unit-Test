package root;

public class MoveZeroes {
	public static int[] moveZeroes(int[] nums) {
		int zeroIndex, nonZeroIndex;
		zeroIndex = findNextZero(nums, 0);
		nonZeroIndex = findNextNonZero(nums, zeroIndex);
		while (zeroIndex < nonZeroIndex) {
			nums[zeroIndex] = nums[nonZeroIndex];
			nums[nonZeroIndex] = 0;

			zeroIndex = findNextZero(nums, zeroIndex);
			nonZeroIndex = findNextNonZero(nums, zeroIndex);
		}
		return nums;
	}

	private static int findNextNonZero(int[] nums, int start) {
		if (start == -1)
			return -1;

		for (int i = start; i < nums.length; i++) {
			if (nums[i] != 0)
				return i;
		}
		return -1;
	}

	private static int findNextZero(int[] nums, int start) {
		for (int i = start; i < nums.length; i++) {
			if (nums[i] == 0)
				return i;
		}
		return -1;
	}

}
