package COREJAVA;

import java.util.Scanner;

public class CustomThrow {

	public static void main(String[] args) {
		
		int i;
		int j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number :");
		i=scan.nextInt();
		System.out.println("enter second number :");
		j=scan.nextInt();
		try {
			
			if(i==0 || j==0)
			{
				throw new  MaheshException("number is zero");
				
			}
			System.out.println("Addition is :" +(i+j));
		}
		
		catch(MaheshException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("the mahesh exception called !");
		}
		
	}

}
