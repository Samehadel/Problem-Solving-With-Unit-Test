package root;

public class LongestCommonSubstring {
    public static int longestCommonSubstring(String wordA, String wordB){
        int longest = 0;
        int [][] gride = new int[wordA.length()][wordB.length()];

        for(int i = 0; i < wordA.length(); i++){
            for(int j = 0; j < wordB.length(); j++){
                if(wordA.charAt(i) == wordB.charAt(j)){
                    if(i < 1 || j < 1)
                        gride[i][j] = 1;
                    else
                        gride[i][j] = gride[i - 1][j - 1] + 1;

                    longest = Integer.max(longest, gride[i][j]);
                }else{
                    gride[i][j] = 0;
                }
            }
        }

        return longest;
    }
}
