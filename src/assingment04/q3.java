package assingment04;
import java.util.*;
public class q3 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	        int n;

	        do {
	            System.out.print("Enter a number (0 to stop): ");
	            n = in.nextInt();

	            if (n == 0) {
	                System.out.println("Program terminated.");
	                break;
	            }

	            if (n % 2 == 0) {
	                System.out.println(n + " is an even number.");
	            } else {
	                System.out.println(n + " is an odd number.");
	            }

	        } while (true);
}
}
