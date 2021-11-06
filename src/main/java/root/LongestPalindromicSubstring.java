package root;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String longest = s.substring(0, 1);
        boolean [][] grid = new boolean[s.length()][s.length()];

        for(int i = 0; i < s.length(); i++){
            grid[i][i] = true;
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)){
                grid[i][i + 1] = true;
                longest = s.substring(i, i + 2);
            }
        }
        for(int size = 3; size <= s.length(); size++){
            for(int i = 0; i < s.length() - 2; i++){
                int indexI = i;
                int indexJ = i + size - 1;

                if(indexJ >= s.length())
                    break;

                if(s.charAt(indexI) == s.charAt(indexJ) && grid[indexI + 1][indexJ - 1]){
                    grid[indexI][indexJ] = true;

                    if(indexJ - indexI + 1 > longest.length())
                        longest = s.substring(indexI, indexJ+1);
                }
            }
        }


        return longest;
    }
}
