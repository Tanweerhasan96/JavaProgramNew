package tanweer;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number :");
			int n= sc.nextInt();
			boolean res=isPallindrome(n);
			if(res==true)
				System.out.println(n+" is a Pallindrome Number....");
			else
				System.out.println(n+" is not a Pallindrome Number....");
		}
	}

	public  static boolean isPallindrome(int n) {
		int rev=0,temp=n;
		while(n!=0) {
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}

}
