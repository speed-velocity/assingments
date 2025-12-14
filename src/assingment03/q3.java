package assingment03;
import java.util.*;
public class q3 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the first number=");
	int a=in.nextInt();
	System.out.println("enter the second number=");
	int b=in.nextInt();
	System.out.println("enter the third number=");
	int c=in.nextInt();
	if(a<b && b<c)
	{
      System.out.println("Increasing");		
	}
	else if(a>b && b>c)
		{
		System.out.println("Decreasing");
		}
else
{
System.out.println("Neither Increasing nor decreasing");
}
}

}
