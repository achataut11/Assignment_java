package assign_array;
import java.util.*;
public class qno19 {
	public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5, 2, 4};
        
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        
        for (int element : sourceArray) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }
        
        Integer[] destinationArray = uniqueElements.toArray(new Integer[0]);
        
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array: " + Arrays.toString(destinationArray));
    }
}
