package assign_array;

public class qno14 {
	public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 9, 6};
        int searchNumber = 2;
        boolean found = false;
        int index = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
