package assign_function;

public class qno10 {
	public static void main(String[] args) {
        int start = 1;
        int end = 10;

        display(start, end);
    }

    public static void display(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
