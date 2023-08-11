package assign_string;

import java.util.*;

public class qno9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder uppercase = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lowercase.append((char)(c - 32));  // Convert to uppercase using ASCII
            } else if (c >= 'A' && c <= 'Z') {
                uppercase.append((char)(c + 32));  // Convert to lowercase using ASCII
            }
        }
        
        System.out.println("Uppercase: " + uppercase.toString());
        System.out.println("Lowercase: " + lowercase.toString());
    }
}
