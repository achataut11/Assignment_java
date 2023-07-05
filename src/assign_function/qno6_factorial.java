package assign_function;
import java.util.Scanner;
public class qno6_factorial {
public static void main(String[] args) {
	get_fact();
}
static void get_fact() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no. ");
	int num= sc.nextInt();
	int fact=1;
	for (int x=1;x<=num;x++) {
		fact*=x;
	}
	System.out.println("factorial is: "+fact);
}
}
