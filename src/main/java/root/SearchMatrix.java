package root;

/*
* Binary Search
* Matrix
*/

public class SearchMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int low = 0;
		int high = matrix.length - 1;
		int mid = 0;

		while (low <= high){
			mid = (low + high) / 2;
			int condition = isInRowRange(matrix, mid, target);

			if(condition == 0){
				return rowContainsTarget(matrix, mid, target);
			} else if(condition == 1){
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return false;
	}

	private static int isInRowRange(int[][] matrix, int rowNumber, int target){
		int lastColumn = matrix[0].length - 1;

		if(matrix[rowNumber][0] <= target && matrix[rowNumber][lastColumn] >= target){
			return 0;
		}else if(matrix[rowNumber][0] > target){
			return -1;
		} else {
			return 1;
		}
	}

	private static boolean rowContainsTarget (int[][] matrix, int row, int target){
		int low = 0;
		int high = matrix[0].length - 1;;
		int mid = 0;

		while (low <= high){
			mid = (low + high) / 2;
			if(matrix[row][mid] == target){
				return true;
			}else if(matrix[row][mid] > target){
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return matrix[row][mid] == target;
	}
}
