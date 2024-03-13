package COREJAVA;

public class Variables {
 public static void main(String[] args) {

	 demo d= new demo();
	 System.out.println(d.result);
	 System.out.println(demo.rs);
	d.add();
	d.sub();
}
}

class demo{
	 int result=89;
	static boolean rs=true;
	
	public void add()
	{
		int c=10;
		int d=12;
		System.out.println(result);
		System.out.println(c+d);
	}
	
	public void sub()
	{
		int e=10;
		int f=5;
		System.out.println(e-f);
		//System.out.println(c);
	}
}