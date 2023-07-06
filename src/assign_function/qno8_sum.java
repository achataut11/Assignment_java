package assign_function;

public class qno8_sum {
	public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        int result = sum(num1, num2, num3);
        System.out.println("Sum: " + result);
    }

    public static int sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
}
