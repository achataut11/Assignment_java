package assign_string;
import java.util.*;

public class qno15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int whitespaceCount = 0;
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".contains(Character.toString(c))) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isWhitespace(c)) {
                whitespaceCount++;
            }
        }
        
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Whitespace count: " + whitespaceCount);
    }
}
