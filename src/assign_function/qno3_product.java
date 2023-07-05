package assign_function;

import java.util.Scanner;

public class qno3_product {
public static void main(String[] args) {
	System.out.println("value is: "+product());
}
static int product() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	return a*b;
}
}
