package assign_string;
import java.util.*;
public class qno1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = sc.nextLine();
	System.out.println("total length: "+(str.length()));
	System.out.println("Last character is: "+(str.charAt(str.length()-1)));
}
}
