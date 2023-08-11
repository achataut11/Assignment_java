package assign_string;

import java.util.*;

public class qno6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        
        System.out.println("Number of white spaces: " + count);
    }
}