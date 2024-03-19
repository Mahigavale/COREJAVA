package COREJAVA;

public class Constructorovercopy {

	public static void main(String[] args) {
		/* depending upon the number and type and sequence of
		 * the arguments we can use the constructors overloading.
		 * it is same as like method overloading.
		 */
		repo r=new repo(56,"dadasaheb");
		
		
		repo r2=new repo(r);
		
		

	}
}

class repo{
	private int id;
	private String name;
	
	public repo(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public repo(repo obje2)
	{
		
		System.out.println("we are printing from copy !");
		System.out.println("name is :" + obje2.name);
		System.out.println("id is :"+ obje2.id);
	}
}