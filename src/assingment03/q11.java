package assingment03;

public class q11 {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int n = in.nextInt();

		        boolean by5 = n % 5 == 0;
		        boolean by6 = n % 6 == 0;

		        System.out.println("Is " + n + " divisible by 5 and 6? " + (by5 && by6));
		        System.out.println("Is " + n + " divisible by 5 or 6? " + (by5 || by6));
		        System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + (by5 ^ by6));
		    }
}

