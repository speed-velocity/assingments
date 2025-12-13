package assingment04;
import java.util.*;
public class q4 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);

	        int random = (int)(Math.random() * 10) + 1;
	        int guess;

	        System.out.println("Guess the number between 1 and 10!");

	        do {
	            System.out.print("Enter your guess: ");
	            guess = in.nextInt();

	            if (guess > random) {
	                System.out.println("Too high, try again.");
	            } else if (guess < random) {
	                System.out.println("Too low, try again.");
	            } else {
	                System.out.println("Good guess!");
	            }
	        } while (guess != random);
	    }
}
