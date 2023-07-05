package assign_array;
import java.util.Scanner;
public class lar_small {
	public static int largest (int[]number) {
		int max=number[0];
		for (int x : number) {
			if (max<x) {
				max=x;
			}
		}
		return max;}
	public static int smallest (int[]number) {
			int min=number[0];
			for (int x : number) {
				if (min>x) {
					min=x;
				}
			}
		return min;		
	}
public static void main(String[] args) {
	int arr[]= {2,4,5,6,5,7};
	System.out.println("Largest no.: "+largest(arr));
	System.out.println("Smallest no.: "+smallest(arr));
}
}
