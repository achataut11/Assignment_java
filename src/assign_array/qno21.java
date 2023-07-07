package assign_array;
import java.util.*;
public class qno21 {
	  public static void main(String[] args) {
	        int[] arr = {1, 5, -7, 3, 2, -5, -2};
	        int element1 = 0;
	        int element2 = 0;
	        int closestSum = Integer.MAX_VALUE;
	        
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                int sum = arr[i] + arr[j];
	                if (Math.abs(sum) < Math.abs(closestSum)) {
	                    closestSum = sum;
	                    element1 = arr[i];
	                    element2 = arr[j];
	                }
	            }
	        }
	        
	        System.out.println("Elements with sum closest to zero: " + element1 + " and " + element2);
	    }
}
