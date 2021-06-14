package root;

/*
    Problem statement:
    Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
     n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
     Find two lines, which, together with the x-axis forms a container, such that the container contains
     the most water.

    Notice that you may not slant the container.
 */
public class ContainerWithMostWater {

    public static int maxArea(int [] arr){
        int ptr1 = 0;
        int ptr2 = arr.length - 1;
        int maxArea = 0;

        while(ptr1 < ptr2){
            int leftElement = arr[ptr1];
            int rightElement = arr[ptr2];
            int newArea = Math.min(leftElement, rightElement) * (ptr2 - ptr1);

            maxArea = Math.max(maxArea, newArea);

            if(leftElement == rightElement){
                if(arr[ptr1 + 1] > arr[ptr2 - 1])
                    ptr1++;
                else
                    ptr2--;
            }else if(leftElement < rightElement)
                ptr1++;
            else
                ptr2--;
        }
        return maxArea;
    }
}
