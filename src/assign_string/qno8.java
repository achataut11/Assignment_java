package assign_string;

import java.util.*;

public class qno8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int specialCharacterCount = 0;
        String specialCharacters = "!@#$%^&*()\":>?";
        
        for (char c : input.toCharArray()) {
            if (specialCharacters.contains(Character.toString(c))) {
                specialCharacterCount++;
            }
        }
        
        System.out.println("Number of special characters: " + specialCharacterCount);
    }
}