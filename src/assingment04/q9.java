package assingment04;
import java.util.*;
public class q9 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = in.nextInt();

	        int sum = 0, temp = n;
	        while (temp > 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }

	        if (n % sum == 0)
	            System.out.println(n + " is a Niven number.");
	        else
	            System.out.println(n + " is not a Niven number.");

}
}
