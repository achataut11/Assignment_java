package assign_string;
import java.util.*;
public class qno3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Set<Character> distinctChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                distinctChars.add(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : distinctChars) {
            result.append(c);
        }
        
        System.out.println("Distinct characters: " + result.toString());
    }
}
