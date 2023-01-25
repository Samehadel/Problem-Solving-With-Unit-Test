package root;

public class MinimumSizeSubarraySum {
	public static int minSubArrayLen(int target, int[] nums) {
		int ans = Integer.MAX_VALUE;
		int low = 1, high = 1;
		int [] sums = prefixSum(nums);

		if(sums[sums.length - 1] < target)
			return 0;

		while(low <= high){
			int subArraySum = sums[high] - sums[low - 1];

			if(subArraySum >= target){
				ans = Math.min(ans, (high - low + 1));
				low ++;
			}else if (subArraySum < target){
				high ++;
			}

			if(high == sums.length || low == sums.length){
				break;
			}
		}

		return ans;
	}

	private static int [] prefixSum(int [] nums){
		int [] sums = new int [nums.length + 1];
		sums[0] = 0;

		for(int i=0; i < nums.length; i++)
			sums[i + 1] = nums[i] + sums[i];

		return sums;
	}
}
