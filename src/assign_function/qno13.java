package assign_function;

public class qno13 {
	public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        displayPrimeNumbers(start, end);
    }

    public static void displayPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkPrime(int testNumber) {
        if (testNumber < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(testNumber); i++) {
            if (testNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
