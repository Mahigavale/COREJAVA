package COREJAVA;

public class GettersandSetters {

	public static void main(String[] args) {
		
		demo2 d2=new demo2();
//		d2.setId(23);
//		d2.setName("mahesh");
//		System.out.println(d2.getId());
//		System.out.println(d2.getName());
		d2.id=34;
		d2.name="mahesh";
		
		System.out.println("id is :"+d2.id);
		System.out.println("name is :" +d2.name);
		
	}
}

class demo2{
	public int id;
	public String name;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	demo2()
	{
	//	System.out.println("default constructor !");
	}
}