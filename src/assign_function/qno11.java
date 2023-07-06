package assign_function;

public class qno11 {
	public static void main(String[] args) {
        int start = 1;
        int end = 20;

        displayOddNumbers(start, end);
    }

    public static void displayOddNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
