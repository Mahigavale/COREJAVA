package COREJAVA;

public class Exceptionhandling {

	public static void main(String[] args) {

		
		arithmetic.div(23,0);
	}
}
class arithmetic{
	
	
	public static void div(int i,int j)
	{
		try {
			double num=(i/j);
			System.out.println("divison is : "+num);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		finally
		{
			System.out.println("div method called!");
		}
	}
	
	
}