package assign_function;
import java.util.Scanner;
public class qno4_area {
public static void main(String[] args) {
	get_area();
}
static void get_area() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter radius");
	Double r=sc.nextDouble();
	Double area= (22/7)*(r*r);
	System.out.println("area is "+area);
	get_circum(r);
}
static void get_circum(Double a) {
	Double circum = 2*(22/7)*a;
	System.out.println("Circumference is: "+circum);
}
}
