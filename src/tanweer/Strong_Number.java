package tanweer;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number :");
			int n= sc.nextInt();
			boolean rs=isStrong(n);
			if(rs==true)
				System.out.println(n+" is a Strong Number....");

			else
				System.out.println(n+" is not a Strong Number....");
	}
	}

	public static boolean isStrong(int n) {
		int sum=0,temp=n;
		while(n!=0) {
			int a=n%10;
			sum=sum+getFact(a);
			n=n/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
	}

	public static int getFact(int a) 
	{
		int fact=1;
		while(a>1)
		{
			fact=fact*a;
			a--;
		}
	
		return fact;
	}
}
	
