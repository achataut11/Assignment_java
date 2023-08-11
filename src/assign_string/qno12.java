package assign_string;

import java.util.*;

public class qno12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        
        System.out.println("Sorted string: " + new String(chars));
    }
}