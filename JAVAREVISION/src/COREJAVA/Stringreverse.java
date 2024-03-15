package COREJAVA;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="I am smart";	
		char[] letters=new char[input.length()];	
		for(int i=0;i<input.length();i++)
		{
			letters[i]=input.charAt(i);
		}
		String op="";
		for(int i=letters.length-1;i>=0;i--)
		{
			op+=letters[i];
		}
	     System.out.println("input:"+ input);
		System.out.println("outpt:"+op);
	}
}
