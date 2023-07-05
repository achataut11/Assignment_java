package assign_array;

public class functions {
    public static void even(int[] arr) {
        System.out.println("Even numbers in the array:");
        for (int i : arr) {
            if (i % 2 == 0 && i > 0) {
                System.out.println(i);
            }
        }
    }

    public static void odd(int[] arr) {
        System.out.println("Odd numbers in the array:");
        for (int i : arr) {
            if (i % 2 != 0 && i > 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int a) {
    	if(a<=1) {
    		return false;
    	}
    	for(int x =2;x<=Math.sqrt(a);x++) {
    		if(a%x==0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static void prime(int[] arr) {
        System.out.println("Prime numbers in the array:");
        for (int i : arr) {
            if (i <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int x = 2; x <= Math.sqrt(i); x++) {
                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int findSumOfPrimes(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int[] copyNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        int[] negatives = new int[count];
        int index = 0;
        for (int i : arr) {
            if (i < 0) {
                negatives[index] = i;
                index++;
            }
        }
        return negatives;
    }

    public static int[] copyPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        int[] positives = new int[count];
        int index = 0;
        for (int i : arr) {
            if (i > 0) {
                positives[index] = i;
                index++;
            }
        }
        return positives;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 43, 5, -67, 843, -5, 6, 3, -4, 35, -75, 7, 85, 67, 9, 45, 76, 87, 100};
        
        System.out.println("Even numbers in the array:");
        even(arr);
        
        System.out.println("Odd numbers in the array:");
        odd(arr);
        
        System.out.println("Prime numbers in the array:");
        prime(arr);
        
        System.out.println("Largest element in the array: " + findLargest(arr));
        
        System.out.println("Second largest element in the array: " + findSecondLargest(arr));
        
        System.out.println("Sum of all the numbers: " + findSum(arr));
        
        System.out.println("Sum of all the prime numbers: " + findSumOfPrimes(arr));
        
        int[] negatives = copyNegatives(arr);
        System.out.println("Negative numbers in a separate array:");
        for (int i : negatives) {
            System.out.println(i);
        }
        
        int[] positives = copyPositives(arr);
        System.out.println("Positive numbers in a separate array:");
        for (int i : positives) {
            System.out.println(i);
        }
    }
}
