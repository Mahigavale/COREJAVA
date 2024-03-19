package COREJAVA;

public class PolymorphisminJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal an=new animal();
		animal.eat(45);
		animal.eat();
		
		an.run();
		an.run(56);
		
	}

}

class animal{
	static void eat()
	{
		System.out.println("jevan");
	}
	
	final void run()
	{
	 System.out.println("runs");
	}
	static void eat(int i)
	{
		System.out.println("eats with parameter");
	}
	
	final void run(int i)
	{
		System.out.println("runs with param!");
	}
}
