package root;

/*
    Problem:
    You have an array of integers, and for each index you want to find the product of every integer
     except the integer at that index. Write a method getProductsOfAllIntsExceptAtIndex()
     that takes an array of integers and returns an array of the products.

     For example, given: [1, 7, 3, 4]
     your method would return: [84, 12, 28, 21]

 */
public class ProductOfAllOther {
    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray){
        int [] beforeIndex = new int [intArray.length];
        int [] afterIndex = new int [intArray.length];
        int [] result = new int [intArray.length];

        for(int i = 0; i < intArray.length; i++){
            if(i == 0) beforeIndex[0] = intArray[0];
            else
                beforeIndex[i] = beforeIndex[i - 1] * intArray[i];
        }

        int lastIndex = intArray.length - 1;
        for(int i = lastIndex; i >= 0; i--){
            if(i == lastIndex)
                afterIndex[lastIndex] = intArray[lastIndex];
            else
                afterIndex[i] = afterIndex[i + 1] * intArray[i];
        }

        //Do the multiplication
        result[0] = afterIndex[1];
        result[intArray.length - 1] = beforeIndex[intArray.length - 2];

        for(int i = 1; i < intArray.length - 1; i++){
            result[i] = beforeIndex[i - 1] * afterIndex[i + 1];
        }

        return result;
    }
}
