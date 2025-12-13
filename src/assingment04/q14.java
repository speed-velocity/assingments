package assingment04;
import java.util.*;
public class q14 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	        System.out.print("Enter the value of N: ");
	        int n = in.nextInt();

	        int evenSum = 0;
	        long oddProduct = 1;

	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                evenSum += i;
	            } else {
	                oddProduct *= i;
	            }
	        }

	        System.out.println("Sum of all even numbers = " + evenSum);
	        System.out.println("Product of all odd numbers = " + oddProduct);
	   
}
}
