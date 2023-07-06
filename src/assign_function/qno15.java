package assign_function;

public class qno15 {
	public static void main(String[] args) {
        int number = 123456;

        int length = findNumberLength(number);
        System.out.println("Length of the number " + number + " is " + length);
    }

    public static int findNumberLength(int number) {
        int length = (int) Math.log10(number) + 1;
        return length;
    }

}
