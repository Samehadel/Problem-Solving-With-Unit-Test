package root;

import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s){
        StringBuilder reversed = new StringBuilder(s);
        int leftPtr = 0;
        int rightPtr = s.length() - 1;
        List<Character> vowels = Arrays.asList('a', 'u', 'e', 'i', 'o', 'A', 'U', 'E', 'I', 'O');

        while(leftPtr < rightPtr){
            char leftChar = reversed.charAt(leftPtr);
            char rightChar = reversed.charAt(rightPtr);

            if(vowels.contains(leftChar) && vowels.contains(rightChar)){
                reversed.setCharAt(leftPtr, rightChar);
                reversed.setCharAt(rightPtr, leftChar);
                leftPtr++;
                rightPtr--;
            }else if (vowels.contains(leftChar) && !vowels.contains(rightChar)){
                rightPtr--;
            }else if (!vowels.contains(leftChar) && vowels.contains(rightChar)){
                leftPtr++;
            }else {
                leftPtr++;
                rightPtr--;
            }
        }


        return new String(reversed);
    }
}
