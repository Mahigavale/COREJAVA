 package COREJAVA;

public class AbstractioninJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pawarlane p;
		gavalelane gl=new gavalelane();
		gl.showdata();
		gl.showschool();
		

	}
}

abstract class Village{
	 public abstract void showdata();
	 
	 public abstract void showschool();
	 
	 public Village()
	 
	 {
		 System.out.println("default constructor in abstract class");
	 }
	 
}


class gavalelane extends Village{
	
	
	public void showdata()
	{
		
		System.out.println("show data from parent!");
	}
	
	
	public void showschool()
	{
		System.out.println("show school form parent !");
	}
}

 abstract class pawarlane extends Village{
	
	public pawarlane()
	{
		System.out.println("default constructor! pawarlane!!");
	}
}

