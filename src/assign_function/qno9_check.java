package assign_function;

public class qno9_check {
	 public static void main(String[] args) {
	        int number = 7;

	        if (isEven(number)) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }
	    }

	    public static boolean isEven(int number) {
	        if (number % 2 == 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
