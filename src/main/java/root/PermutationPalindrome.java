package root;

import java.util.HashMap;

public class PermutationPalindrome {

    public static boolean checkPermutationPalindrome(String theString){
        if(theString.length() == 0) return true;

        // check if any permutation of the input is a palindrome
        HashMap<Character, Integer> charMap = new HashMap<>();
        int nOdds = 0;

        for(int i = 0; i < theString.length(); i++){
            char key = theString.charAt(i);

            if(!charMap.containsKey(key)){
                charMap.put(key, 1);
                nOdds ++;
            }else{
                int preValue = charMap.get(key);
                if (preValue % 2 != 0)
                    nOdds --;

                charMap.put(key, preValue + 1);
            }
        }

        return nOdds == 1 || nOdds == 0;
    }
}
