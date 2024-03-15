package COREJAVA;

import java.util.Scanner;

public class Arrayinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner st=new Scanner(System.in);
		System.out.println("how many numbers:");
		int number=st.nextInt();
		
		int[] numbers=new int[number];
		
		for(int i=0;i<number;i++)
		{
			System.out.println("please enter the"+(i+1) +" number");
			
			numbers[i]=st.nextInt();
		}
		
		for(int i=0;i<number;i++)
			
		{
			System.out.println(numbers[i]);
		}
	} 

}
