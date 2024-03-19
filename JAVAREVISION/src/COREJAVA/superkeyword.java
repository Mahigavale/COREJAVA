package COREJAVA;

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 assign2 a2=new assign2();
	}

}


class assign{
	
	int id;
	String name;
	
	public assign(int id)
	{
		this.id=id;
		
		System.out.println("called from child class!");
		System.out.println(id);
	}
	
	public assign()
	{
		
	}
}


class assign2 extends assign{
	int n;
	
	public assign2()
	{
		this(12);
	}
	
	public assign2(int n)
	{   
		System.out.println("called from different constructor");
		System.out.println(n);
	}
}