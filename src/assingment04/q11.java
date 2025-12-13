package assingment04;
import java.util.*;
public class q11 {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (sum == n)
            System.out.println(n + " is a perfect number.");
        else
            System.out.println(n + " is not a perfect number.");

    }
}
