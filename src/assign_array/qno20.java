package assign_array;

public class qno20 {
	 public static void main(String[] args) {
	        int[] arr = {54, 23, 12, 65, 77, 43, 29};
	        int element1 = 65;
	        int element2 = 77;
	        
	        boolean containsElements = false;
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == element1) {
	                for (int j = i + 1; j < arr.length; j++) {
	                    if (arr[j] == element2) {
	                        containsElements = true;
	                        break;
	                    }
	                }
	            }
	        }
	        
	        if (containsElements) {
	            System.out.println("Array contains both elements: " + element1 + " and " + element2);
	        } else {
	            System.out.println("Array does not contain both elements: " + element1 + " and " + element2);
	        }
	    }
}
