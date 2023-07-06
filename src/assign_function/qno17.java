package assign_function;

public class qno17 {
	public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;

        boolean result = isSameNum(num1, num2);
        System.out.println(result);
    }

    public static boolean isSameNum(int num1, int num2) {
        return num1 == num2;
    }
}
