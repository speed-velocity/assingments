package assingment04;
import java.util.*;
public class q13 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	        System.out.print("Enter the range (N): ");
	        int n = in.nextInt();

	        int sum = 0;
	        for (int i = 1; i < n; i++) {
	            if (i % 3 == 0 || i % 5 == 0) {
	                sum += i;
	            }
	        }

	        System.out.println("The sum of all multiples of 3 or 5 below " + n + " is: " + sum);
}
}
