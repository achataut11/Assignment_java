package assign_array;
import java.util.*;
public class qno22 {
	public static void main(String[] args) {
        int[] arr = {1, -3, -2, 4, -6, 5, -7, 8};
        int[] sortedArr = new int[arr.length];
        
        int positiveIndex = 0;
        int negativeIndex = arr.length - 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sortedArr[negativeIndex] = arr[i];
                negativeIndex--;
            } else {
                sortedArr[positiveIndex] = arr[i];
                positiveIndex++;
            }
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
}
