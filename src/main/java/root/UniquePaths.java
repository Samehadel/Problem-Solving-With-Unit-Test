package root;

/*
Problem Statement:
    A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
    The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
    How many possible unique paths are there?
 */
public class UniquePaths {

    public static void main(String [] args){
        uniquePathsV2(5, 5);

    }
    public static int uniquePaths(int m, int n) {

        int [][] grid = new int [m][n];

        for(int i = 0; i < m; i++)
            grid[i][n - 1] = 1;

        for(int j = 0; j < n; j++)
            grid[m - 1][j] = 1;


        for(int j = m - 2; j >= 0; j--){
            for(int i = n - 2; i >=0 ; i--){
                grid[j][i] = grid[j][i + 1] + grid[j + 1][i];
            }
        }

        return grid[0][0];
    }

    public static int uniquePathsV2(int m, int n) {

        int [] arr = new int [n];
        arr[n - 1] = 1;

        for(int j = 0; j < m; j++){
            for(int i = n - 1; i > 0; i--){
                if(j == 0)
                    arr[i - 1] = 1;
                else {
                    arr[i - 1] += arr[i];
                }
            }
        }

        return arr[0];
    }
}
