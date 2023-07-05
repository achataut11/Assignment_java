package assign_function;
import java.util.Scanner;
public class qno7_avg {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 different 1"
			+ "3"
			+ "4"
			+ "numbers: ");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	averageNumber(a,b,c);
}
static void averageNumber(int num1 , int num2 , int num3) {
	int a = 0;
	if (num1> num2 && num1>num3) {
		
		a=num1;
	}
	else if (num2> num1 && num2>num3) {
		a=num2;
	}
	else {
		a=num3;
	}
	System.out.println(a+" is greatest");
if (num1< num2 && num1<num3) {
		
		a=num1;
	}
	else if (num2< num1 && num2<num3) {
		a=num2;
	}
	else {
		a=num3;
	}
	System.out.println(a+" is smallest");
}
}
