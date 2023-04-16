package tanweer;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter a number :");
			int n=sc.nextInt();
			boolean res=isArmstrong(n);
			if(res==true)
			{
				System.out.println(n+ " is an Armstrong Number");
			}
			else {
				System.out.println(n+ " is not an Armstrong Number");
			}
		}
	}

	public  static boolean isArmstrong(int n) {
		int sum=0,temp=n;
		int p=digitCount(n);
		do
		{
			int a=n%10;
			sum=sum+pow(a,p);
			n=n/10;
		}while(n!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}

     public static int pow(int a, int p) 
     {
    	int prod=1;
    	while(p>0) {
    		prod=prod*a;
    		p--;
    	}
		return prod;
	}

	public  static int digitCount(int n) 
     {
    	 int count=0;
    	 do {
    		 count++;
    		 n=n/10;
    	 }while(n!=0);

    	 return count;
	}
	

}
