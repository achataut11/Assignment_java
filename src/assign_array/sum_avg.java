package assign_array;
import java.util.Scanner;
public class sum_avg {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int n = sc.nextInt();
     int arr[] = new int[n];
     for (int x = 0; x < n; x++) {
         System.out.println("Enter element " + (x + 1) + ":");
         arr[x] = sc.nextInt();
     }
     int sum = 0;
     for (int x = 0; x < n; x++) {
         sum+=arr[x];
     }
     int avg=sum/n;
     System.out.println("sum = "+sum+" avg = "+avg);
}
}
