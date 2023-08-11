package assign_string;
import java.util.*;
public class qno2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 string: ");
	String s1= sc.next();
	String s2=sc.next();
	if (s1.equals(s2)) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
}}