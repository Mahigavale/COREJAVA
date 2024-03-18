package COREJAVA;

public class Inheritance {
  public static void main(String[] args) {
	
//	  demo12 der=new demo12();
//	  der.demo();
//	  der.demoe();
//	  der.id=34;
//	  der.id2=65;
//	  System.out.println("id is :"+der.id);
//	  System.out.println("id2 is :"+der.id2);
	  
	   c c1=new c();
	   c1.id=34;
	   
}
}


class demo34{
	public int id;
	public String name;
	
	public void demo()
	{
		 System.out.println("the demo method in demo34");
	}
	
}
class demo12 extends demo34
{
    public int id2;
    public String name2;
    
    public void demoe()
    {
    	System.out.println("demo from demo12");
    }
}

class c extends demo12
{
	
}