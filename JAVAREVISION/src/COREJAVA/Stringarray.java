package COREJAVA;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first,middle,last;
		Scanner st=new Scanner(System.in);
		
		System.out.println("please enter the first name:");
		first=st.next();
		System.out.println("please enter the middle name:");
		middle=st.next();
		System.out.println("please enter the last name:");
		last=st.next();
		
	String	fullname = first+middle+last;
	
	char[] reverse=new char[fullname.length()];
	
		for(int i=0;i<fullname.length();i++)
		{
		reverse[i]=fullname.charAt(i);
			
		}	
		for(int i=0;i<fullname.length();i++)
		{
		System.out.print(reverse[i]+" ");
		}
		
		st.close();
	}

}
