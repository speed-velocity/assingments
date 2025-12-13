package assingment04;
import java.util.*;
public class q6 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = in.nextInt();

	        int original = num;
	        int reverse = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num = num / 10;
	        }

	        System.out.println("Reversed number: " + reverse);

	        if (original == reverse) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	    }
	}


