package assign_array;
import java.util.*;
public class qno15 {
	public static void main(String[] args) {
        int[] arr = {3, 1, 6, 2, 9, 4};
        
        // Sort in ascending order
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        
        // Sort in descending order
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
