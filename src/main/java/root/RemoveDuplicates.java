package root;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;

        int uniques = nums.length;

        int i = 1;
        int n = nums[0];

        while(i < nums.length){
            if(n == nums[i]) {
                while(i < nums.length && nums[i] == n){
                    uniques--;
                    i++;
                }
            }else {
                n = nums[i];
                i++;
            }
        }

        return uniques;
    }
}
