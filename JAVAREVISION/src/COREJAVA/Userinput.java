package COREJAVA;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String firstname;
		String Middlename;
		String Lastname;
		
		System.out.println("please enter first name:");
		firstname=sc.next();
		System.out.println("please enter middle name:");
		Middlename=sc.next();
		System.out.println("Please enter last name:");
		Lastname=sc.next();
		System.out.println("here is your full name");
		System.out.println("====>"+firstname+" "+Middlename+" "+Lastname);

	}

}
