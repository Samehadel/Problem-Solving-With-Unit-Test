package root;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String [] args){
        //String [] strs = {"car", "care", "career"};
        String [] strs = {"car", "care gas", "career"};

        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {


/*
        if(strs.length == 1)
            return strs[0];

        int i = 0;
        while(true){
            boolean check = false;

            try{
                for(int j = 1; j < strs.length; j++){
                    char compareTo = strs[0].charAt(i);
                    char compareWith = strs[j].charAt(i);
                    if(compareTo == compareWith){
                        if(j + 1 == strs.length){
                            commonPrefix += strs[j].charAt(i);
                        }
                    }else{
                        check = true;
                        break;
                    }
                }
                if (check)
                    break;
                i++;
            }catch (IndexOutOfBoundsException ex){
                break;
            }
        }
*/
        Arrays.sort(strs);

        int i = 0;
        while(i < strs[0].length()){
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                i++;
            }else{
                break;
            }
        }

        if(i > 0)
            return strs[0].substring(0, i);

        return "";
    }
}
