package tanweer;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter a Number :");
		  int n= sc.nextInt();
		  int fact=getFact(n);
		  System.out.println(fact);
	}
	}

	public  static int getFact(int n) 
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

}
