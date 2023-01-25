package root;

import java.util.HashMap;

public class SubArraySum {

	public static int subarraySum(int[] nums, int k) {
		int sum = 0;
		int result = 0;
		HashMap<Integer, Integer> prefix = new HashMap<>();

		prefix.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			int count = prefix.getOrDefault(sum - k, 0);
			prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);

			result += count;
		}

		return result;
	}

}