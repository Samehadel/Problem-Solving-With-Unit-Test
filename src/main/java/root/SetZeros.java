package root;

import java.util.ArrayList;
import java.util.List;

public class SetZeros {
	public static void setZeroes(int[][] matrix) {
		// Extract the columns and rows to be set
		List<List<Integer>> indices = new ArrayList();

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
				if (matrix[rowIndex][columnIndex] == 0) {
					indices.add(List.of(rowIndex, columnIndex));
				}
			}
		}

		// Apply the set process
		indices.forEach(list -> {
			Integer row = list.get(0);
			Integer column = list.get(1);

			resetColumns(matrix, row);
			resetRows(matrix, column);
		});
	}

	private static void resetColumns(int[][] matrix, Integer row) {
		for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
			matrix[row][columnIndex] = 0;
		}
	}

	private static void resetRows(int[][] matrix, Integer column) {
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			matrix[rowIndex][column] = 0;

		}
	}
}
