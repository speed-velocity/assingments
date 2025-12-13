package assingment04;
import java.util.*;
public class q15 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		        int sum = 0;
		        int sumOfSquares = 0;

		        for (int i = 1; i <= 100; i++) {
		            sum += i;
		            sumOfSquares += i * i;
		        }

		        int squareOfSum = sum * sum;
		        int difference = squareOfSum - sumOfSquares;

		        System.out.println("Sum of squares of first 100 natural numbers = " + sumOfSquares);
		        System.out.println("Square of the sum of first 100 natural numbers = " + squareOfSum);
		        System.out.println("Difference = " + difference);
	}
}
