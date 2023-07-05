package assign_function;
import java.util.Scanner;
public class qno5_vote {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your age: ");
	int age=sc.nextInt();
	eiligibility(age);
}
static void eiligibility(int age) {
	if (age<18) {
		System.out.println("not allowed to vote");
	}
	else {
		System.out.println("allowed to vote");
	}
}
}
