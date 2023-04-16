package tanweer;

import java.util.Scanner;
import java.util.stream.Stream;

public class Details {

	
	public static void main(String[] args) 
	{
		
	        Scanner sc = new Scanner(System.in); 
			System.out.println("Enter age:");
			int age = sc.nextInt();
			System.out.println("enter percentage:");
			float per=sc.nextFloat();
			System.out.println("enter college :");
			sc.nextLine();
			String  college = sc.nextLine();
			
			System.out.println(college);
			System.out.println(per);
			System.out.println(age);
			
		
	
	}

}
