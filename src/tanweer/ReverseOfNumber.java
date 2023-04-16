package tanweer;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a Number :");
			int n=sc.nextInt();
			int rs=reverse(n);
			System.out.println("Reverse of the Number :"+rs);
		}
		}
		
	

	public static int reverse(int n) {
		int rev=0;
		while(n!=0)
		{
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		return rev;
	}

}
