package assingment04;
import java.util.*;
public class q12 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	        System.out.print("Enter the base: ");
	        int base = in.nextInt();

	        System.out.print("Enter the power: ");
	        int exp =in.nextInt();

	        int result = 1;
	        for (int i = 1; i <= exp; i++) {
	            result *= base;
	        }

	        System.out.println(base + " to the power " + exp + " is: " + result);
	    }
}
