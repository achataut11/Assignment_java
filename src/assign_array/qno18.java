package assign_array;
import java.util.*;
public class qno18 {
	public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array: " + Arrays.toString(destinationArray));
    }
}
