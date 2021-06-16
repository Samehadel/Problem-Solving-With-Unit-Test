package root;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestProductOfThree {

    public static int highestProductOf3(List<Integer> numbers){
        if(numbers.size() == 3)
            return numbers.get(0) * numbers.get(1) * numbers.get(2);

        numbers.subList(0, 3).sort(Collections.reverseOrder());

        int max1 = numbers.get(0);
        int max2 = numbers.get(1);
        int max3 = numbers.get(2);

        for(int i = 3; i < numbers.size(); i++){
            int value = numbers.get(i);
            int temp1;
            int temp2;

            if(value > max1){
                temp1 = max1;
                temp2 = max2;

                max1 = value;
                max2 = temp1;
                max3 = temp2;

            }else if(value > max2){
                temp1 = max2;

                max2 = value;
                max3 = temp1;
            }else if (value > max3){
                max3 = value;
            }
        }
        return max1 * max2 * max3;
    }
}
