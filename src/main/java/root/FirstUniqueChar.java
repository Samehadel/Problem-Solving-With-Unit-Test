package root;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static int findFirstUniqueChar(String word){
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            charCount.merge(word.charAt(i), 1, (a, b) -> a + 1);
        }
        for(int i = 0; i < word.length(); i++){
            if(charCount.get(word.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
