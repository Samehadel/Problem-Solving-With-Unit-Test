package root;

public class FindRotationPoint {
    public static int findRotationPoint(int [] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        int mid = (low + high) / 2;

        // find the rotation point in the array
        while (low <= high) {
            mid = (low + high) / 2;

            if(mid == 0)
                break;

            if (numbers[mid] > numbers[mid - 1] && numbers[mid] > numbers[mid + 1])
                break;
            else if (numbers[mid] > numbers[low])
                low = mid + 1;
            else if(numbers[mid] < numbers[low])
                high = mid;
        }

        return mid + 1;
    }
}
