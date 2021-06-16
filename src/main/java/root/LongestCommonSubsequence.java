package root;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String wordA, String wordB){
        int longest = 0;
        int [][] gride = new int[wordA.length()][wordB.length()];

        for(int i = 0; i < wordA.length(); i++){
            for(int j = 0; j < wordB.length(); j++){
                if(wordA.charAt(i) == wordB.charAt(j)){
                    if( i < 1 || j < 1)
                        gride[i][j] = 1;
                    else
                        gride[i][j] = gride[i - 1][j - 1] + 1;

                    longest = Integer.max(longest, gride[i][j]);
                }else{
                    if( i < 1 && j < 1)
                        gride[i][j] = 0;
                    else if (i < 1)
                        gride[i][j] = gride[i][j - 1];
                    else if (j < 1)
                        gride[i][j] = gride[i - 1][j];
                    else
                        gride[i][j] = Integer.max(gride[i][j - 1], gride[i - 1][j]);

                }
            }
        }

        return longest;
    }
}
