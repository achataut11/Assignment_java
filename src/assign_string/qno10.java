package assign_string;

import java.util.*;

public class qno10{
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
        
        for (String s : strings) {
            System.out.println("Length of \"" + s + "\": " + s.length());
        }
    }
}