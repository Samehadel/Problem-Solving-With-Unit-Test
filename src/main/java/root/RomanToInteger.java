package root;

public class RomanToInteger {
    private static int [] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static String [] romanNumbers = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static int romanToInt(String s) {

        int number = 0;

        for(int i = 0; i < s.length(); i++){
            boolean checkDoubleLetter = false;

            if(i + 1 < s.length()){
                // Search for two letters
                String comb = s.charAt(i) + "" + s.charAt(i + 1);

                for(int j = 0; j < romanNumbers.length; j ++){
                    if(comb.equals(romanNumbers[j])) {
                        number += numbers[j];
                        checkDoubleLetter = true;
                        i++;
                        break;
                    }
                }
            }
            if(!checkDoubleLetter){
                for(int j = 0; j < romanNumbers.length; j ++){
                    if(String.valueOf(s.charAt(i)).equals(romanNumbers[j])) {
                        number += numbers[j];
                        break;
                    }
                }
            }
        }

        return number;
    }
}
