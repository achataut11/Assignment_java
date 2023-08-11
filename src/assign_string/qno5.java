package assign_string;
import java.util.*;
public class qno5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        
        System.out.println("Reversed string: " + reversed.toString());
    }
}