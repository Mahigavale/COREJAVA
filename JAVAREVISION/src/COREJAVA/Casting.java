package COREJAVA;

public class Casting {
 public static void main(String[] args) {
	
	 /* there are two types of castings in java.
	  * 1)widening-> store small data into big one. default.
	  * 2)narrowing->store big into small. manual.
	  * 
	  * 
	  * 
	  */
	 
	 double d=8.89d;
	 
	 System.out.println(d);
	 
	int c=(int)d;
	 System.out.println(c);
	 //narrowing
	 
	 
	 int num=123;
	 double d1=num;
	 System.out.println(num);
	 System.out.println(d1);
	 //widening
	 
}
}
