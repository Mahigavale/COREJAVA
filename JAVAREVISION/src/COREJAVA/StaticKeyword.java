package COREJAVA;

public class StaticKeyword {

	public static void main(String[] args) {
   
	   
		demo789 d3=new demo789();
		
		
		demo789.add(3456,"onion");

	}

}

 class demo789
{
	static int i;
	static String name;
	int id;
	String name2;
	
	
	static void add(int i2, String name4)
	{
		i=i2;
		name=name4;
		System.out.println("accessing the static variables of class.");
		System.out.println("from static method in class"+ i +" " + name);
		
	}
	
	
	public demo789()
	{
		System.out.println("defualt constructor!");
	}
	static
	{
		System.out.println("this is the static block of demo789!");
	}
}
 

  /*
   * the static block of the class in accessed only once before 
   * constructor calling. 
   * and it is used to intialize the static variables in the class.
   */
 
 
 
 
 