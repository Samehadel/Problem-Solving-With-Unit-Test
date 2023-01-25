package root;

import java.util.HashMap;

public class ContainsDuplicateII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		if(k == 0 || nums.length < 2){
			return false;
		}

		for(int i = 0; i < nums.length; i++){
			int latestPosition = map.getOrDefault(nums[i], i);

			if(latestPosition != i){
				if(i - latestPosition <= k && nums[i] == nums[latestPosition]){
					return true;
				}else {
					map.put(nums[i], Math.max(latestPosition, i));
				}
			}else {
				map.put(nums[i], i);

			}
		}
		return false;
	}

}
