package COREJAVA;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		access acs=new access();
		
		//when we make the constructor private we can't access
		//it in the main method class.
		
		//we cannot declare the constructor as defualt.
		
		//we can declare as protected.
		//it is used to initialize the private
		//variables in class.
	}

}

class access {
	private int id;
	private String name;
	
	protected access()
	{
		id=45;
		name="mahesh";
		System.out.println("id private :"+id);
		System.out.println("name private :"+name);
	
	}
}