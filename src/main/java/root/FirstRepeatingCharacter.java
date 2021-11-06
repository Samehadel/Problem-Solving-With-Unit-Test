package root;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {

    public static char firstRepeatingCharacter(String s){
        Set<Character> set = new HashSet();
        String word = s.toLowerCase();

        for(int i = 0; i < word.length(); i++){
            char current = word.charAt(i);

            if(set.contains(current))
                return current;
            else
                set.add(current);
        }

        return ' ';
    }
}
