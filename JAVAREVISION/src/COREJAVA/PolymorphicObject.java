package COREJAVA;

public class PolymorphicObject {

	public static void main(String[] args) {

		demowe we=new child();
		we.demo();
	//we can create the reference of the parent with the 
		//child object but cannot access the child methods.
		/* this type of object is called as the polymorphic 
		 * object.
		 * 
		 * 
		 */
		
		
	
		 
	}

}

class demowe {
	
	public void demo()
	{
		System.out.println("demo method of parent class");
	}
}

class child extends demowe
{
	public void demo2()
	{
		System.out.println("demo2 of child class !");
	}
}