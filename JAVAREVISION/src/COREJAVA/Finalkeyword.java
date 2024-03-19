package COREJAVA;

public class Finalkeyword {
  public static void main(String[] args) {
	
	  demo56 d=new demo56();
	  
	  d.i=56;
	  d.name="mahesh";
	  
}
}


 class demo56
{
	
	
	 int i;
	String name;
	public demo56()
	{
		System.out.println("default constructor !");
	}
	
	final void add()
	{
		System.out.println(i+name);
	}
}
 
 class demo57 extends demo56
 {
//	public void add()
//	{
//		System.out.println("from child class demo");
//	}
	 
	 /*we cannot override the final method from
	  * the parent class.
	  * final variables must be intialized for declaration
	  * time . as it is.
	  */ 
	 
 }



