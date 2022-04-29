package root;

public class RotateArray {
	public static int [] rotate(int[] nums, int k) {
		k = k % nums.length;

		reverseArray(nums, 0, nums.length - 1);
		reverseArray(nums, 0, k - 1);
		reverseArray(nums,  k, nums.length - 1);
		return nums;
	}

	private static void reverseArray(int[] nums, int start, int end){
		if(start >= end)
			return;

		int mid = (start + end) >>> 1;

		for(int i = start; i <= mid; i++){
			int temp = nums[i];
			nums[i] = nums[end];
			nums[end] = temp;
			end -- ;
		}
	}
}
