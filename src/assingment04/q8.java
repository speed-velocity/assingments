package assingment04;
import java.util.*;
public class q8 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int x = in.nextInt();

	        System.out.print("Enter the second number: ");
	        int y = in.nextInt();

	        int a = x, b = y;
	        while (b != 0) {
	            int r = a % b;
	            a = b;
	            b = r;
	        }

	        System.out.println("GCD of " + x + " and " + y + " is " + a);

}
}
