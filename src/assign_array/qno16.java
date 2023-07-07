package assign_array;
import java.util.*;
public class qno16 {
	public static void main(String[] args) {
        String[] names = {"John", "Mary", "Paul", "John", "Alice", "Paul", "Michael", "John", "David", "Alice"};
        
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));
        String[] newArray = uniqueNames.toArray(new String[0]);
        
        System.out.println("Array with duplicates removed: " + Arrays.toString(newArray));
    }
}
