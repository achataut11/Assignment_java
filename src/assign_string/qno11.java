package assign_string;

import java.util.*;

public class qno11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        
        // Sort in ascending order of length
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("Sorted by length (ascending): " + Arrays.toString(strings));
        
        // Sort in descending order of length
        Arrays.sort(strings, (a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("Sorted by length (descending): " + Arrays.toString(strings));
    }
}
