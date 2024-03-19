package COREJAVA;

public class Throwsdemo {

	public static void main(String[] args) {
		
		tyu u=new tyu();
		try
		{
			u.add(23,130);
		}
		catch(MaheshException e)
		{
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
		
		System.out.println(e.getMessage());
		} catch (MaheshExeption2 e) {
		
			System.out.println(e.getMessage());
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
	}
}

class tyu{
	
	public void add(int j, int k)throws MaheshException, MaheshExeption2, ArithmeticException , Exception
	{
		if(k==0 || j==0)
		{
			throw new MaheshException("Mahesh Exception:=zero occured!");
		}
		else if( j>100 || k >100)
		{
			throw new MaheshExeption2("no grater than 100");
		}
		
		System.out.println(j+k);
	}
}