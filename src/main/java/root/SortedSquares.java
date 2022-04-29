package root;

public class SortedSquares {
	public static int[] sortedSquares(int[] nums) {
		int [] squares = new int [nums.length];
		int leftPtr = 0;
		int rightPtr = nums.length - 1;
		int insertionPosition = nums.length - 1;

		while(leftPtr <= rightPtr){
			if(insertionPosition == 0){
				squares[insertionPosition] = nums[leftPtr] * nums[leftPtr];
				break;
			}
			if(maxIsRight(nums, leftPtr, rightPtr)){
				squares[insertionPosition] = nums[rightPtr] * nums[rightPtr];
				insertionPosition --;
				rightPtr --;
			}else{
				squares[insertionPosition] = nums[leftPtr] * nums[leftPtr];
				insertionPosition --;
				leftPtr ++;
			}
		}
		return squares;
	}

	private static boolean maxIsRight(int[] nums, int leftPtr, int rightPtr){
		int leftSqr = nums[leftPtr] * nums[leftPtr];
		int rightSqr = nums[rightPtr] * nums[rightPtr];

		return rightSqr > leftSqr;
	}
}
