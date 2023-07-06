package assign_function;

public class qno14 {
	public static void main(String[] args) {
        int inputNumber = 5;

        printMultiplication(inputNumber);
    }

    public static void printMultiplication(int inputNumber) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " * " + i + " = " + (inputNumber * i));
        }
    }
}
