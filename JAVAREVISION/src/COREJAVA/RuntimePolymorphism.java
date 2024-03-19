package COREJAVA;

public class RuntimePolymorphism {

	public static void main(String[] args) {

		animal1 an1=new tiger();
		
		an1.run();
		
	}
}

class animal1{
	
	protected void run()
	{
		System.out.println("the run method from the animal");
	}
}

class tiger extends animal1{
	public void run()
	{
		System.out.println("the run  from the tiger !");
	}
}