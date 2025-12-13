package assingment04;
import java.util.*;
public class q10 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = in.nextInt();

        int result = 0, place = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }
            n /= 10;
        }

        System.out.println("After removing 0, the new number is " + result);
  
	}

}
