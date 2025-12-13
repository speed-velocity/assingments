package assingment03;
import java.util.*;
public class q4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int cg=(int)(Math.random()*9)+1;
		System.out.println("Enter user number");
		int n=in.nextInt();
		
		if(n==cg)
		{
			System.out.println("You got it right");
		}
		else if(n==cg+1 ||n==cg-1)
		{
			System.out.println("Almost got it");
		}
		else
		{
			System.out.println("You got it wrong");
		}

}
}
