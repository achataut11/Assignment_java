package assign_array;
import java.util.*;
public class qno17 {
	 public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5, 7, 9};
	        int[] arr2 = {2, 4, 6, 8, 9};
	        
	        ArrayList<Integer> commonElements = new ArrayList<>();
	        
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    commonElements.add(arr1[i]);
	                    break;
	                }
	            }
	        }
	        
	        Integer[] commonArray = commonElements.toArray(new Integer[0]);
	        System.out.println("Common Elements: " + Arrays.toString(commonArray));
	    }
}
