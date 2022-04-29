package root;

public class FirstAndLastPosition {
    public static int [] searchRange(int[] nums, int target) {

        if(nums.length == 0)
            return new int[] {-1, -1};

        int low = 0;
        int high = nums.length - 1;
        int l = -1;
        int h;

        while (low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                l = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }

        h = l + 1;

        while(h < nums.length && nums[h] == target)
            h++;

        return new int[]{l, --h};
    }
}
