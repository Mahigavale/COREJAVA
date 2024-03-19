package COREJAVA;

public class Interfaceworkinginjava {

	public static void main(String[] args) {
		ddr d=new ddr();
		d.add();
		 
		ssd.add2();
        ssd1.add2();		
	}
}

 interface ssd{
	 public void add();
	 
	 default public void sub()
	 {
		System.out.println("the body for a method in interface!");
	 }
	 public static void add2()
	 {
		 System.out.println("asdfghfd");
	 }
	}
 
 @FunctionalInterface
 interface ssd1{
	 public void add();
	 default public void sub1()
	 {
		 System.out.println("the sub with body in interface!");
	 }
	 
	 public static void add2()
	 {
		 System.out.println("asdfghjk");
	 }

 }
 
 
 class ddr implements ssd,ssd1
 
 {
	 public void add()
	 
	 {
		 System.out.println("add in child class !");
	 }
 }