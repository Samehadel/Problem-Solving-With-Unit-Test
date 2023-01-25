package root;

import java.util.HashMap;

public class ContiguousArray {
	public static int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int longestSubArray = 0;

		map.put(0, -1);

		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0)
				nums[i] = -1;

			sum += nums[i];

			int firstLocation = map.getOrDefault(sum, i);
			int sumLocation = Math.min(map.getOrDefault(sum, i), i);
			map.put(sum, sumLocation);
			longestSubArray = Math.max(i - firstLocation, longestSubArray);
		}

		return longestSubArray;
	}

	private static int [] prefixSum(int [] nums){
		int [] sums = new int [nums.length + 1];
		sums[0] = 0;

		for(int i=0; i < nums.length; i++) {
			if(nums[i] == 0)
				nums[i] = -1;

			sums[i + 1] = nums[i] + sums[i];
		}
		return sums;
	}
}
