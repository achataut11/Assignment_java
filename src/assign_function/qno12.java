package assign_function;

public class qno12 {
	public static void main(String[] args) {
        int testNumber = 17;

        boolean isPrime = checkPrime(testNumber);
        if (isPrime) {
            System.out.println(testNumber + " is prime.");
        } else {
            System.out.println(testNumber + " is not prime.");
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
