package COREJAVA;

import java.util.Scanner;

public class Arithmetics {
 public static void main(String[] args) {
	
	 System.out.println("please enter the first number:");
	 Scanner st=new Scanner(System.in);
	 int num1=st.nextInt();
	 System.out.println("please enter the second number:");
	 int num2=st.nextInt();
	 
	 System.out.println("add:>" +(num1+num2));
	 
	 System.out.println("sub :>"+ (num1-num2));
	 
	 System.out.println("Mul :>"+num1*num2);
	 
	 System.out.println("DIv :>"+num1/num2);
}
}
