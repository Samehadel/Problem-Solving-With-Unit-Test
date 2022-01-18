package root;

public class IntegerToRoman {
    private static int [] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static String [] romanNumbers = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};


    public static String intToRoman(int num){
        String roman = "";

        while(num > 0){
            int i = 0;
            while (i < numbers.length && numbers[i] <= num)
                i++;

            roman += romanNumbers[i - 1];

            num -= numbers[i - 1];
        }

        return  roman;
    }

}
