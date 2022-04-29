package root;

public class NumberOfIslands {

    /*private static char[][] grid = {{'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}};*/

    /*private static char[][] grid = {{'1', '1', '0', '1', '0'},
                                    {'1', '1', '0', '0', '1'},
                                    {'1', '0', '1', '0', '0'},
                                    {'0', '0', '0', '1', '1'}};*/

    private static char[][] grid = {{'1', '1', '1'},
                                    {'0', '1', '0'},
                                    {'1', '1', '1'}};

    public static void main(String [] args){
        System.out.println(numIslands());
    }

    public static int numIslands() {
        int numOfIslands = 0;

        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] == '1') {

                    // Flip?
                    if ((j + 1 == grid[0].length || grid[i][j + 1] == '0') && (i + 1 == grid.length || grid[i + 1][j] == '0')) {
                        grid[i][j] = '0';
                    }

                    // Increment?
                    if ((i - 1 < 0 || grid[i - 1][j] == '0') && (j - 1 < 0 || grid[i][j - 1] == '0'))
                        numOfIslands++;

                }

            }
        }

        return numOfIslands;
    }
}
