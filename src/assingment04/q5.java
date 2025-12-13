package assingment04;
import java.util.*;
public class q5 {
public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	        System.out.print("Enter first number: ");
	        int first = in.nextInt();

	        System.out.print("Enter second number: ");
	        int second = in.nextInt();

	        System.out.print("Enter third number: ");
	        int step = in.nextInt();

	        int sum = 0;

	        for (int i = first; i <= second; i += step) {
	            System.out.print(i + " ");
	            sum += i;
	        }

	        System.out.println();
	        System.out.println("The sum of number displayed is " + sum);
	    }
}
