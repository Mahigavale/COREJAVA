package COREJAVA;

public class Stringclass {

	public static void main(String[] args) {
		
		/* there are two ways to create string in java.
		 *  without new operator => string literal.
		 *  with new operator => String Object.
		 *  remember the thing every string literal is
		 *  stored inside the SCP in the heap.
		 *  while the new keyword creates the every new object
		 *  in the java.
		 *  so remember the SCP  which is part of heap.
		 * 
		 */

		String str="mahesh";
		System.out.println(str.concat(" dada"));
		System.out.println(str);
		/*even after concat operation the original 
		 *  string is unchanged.
		 * 
		 * 
		 */
		
		
		
		String str2="mahesh";
		String str3="mahesh";
		System.out.println(str2==str3);
		
		String str4= new String("mahesh");
		String str5=new String("mahesh");
		System.out.println(str4==str5);
		/* String.equals(String2) checks the values only.
		 * and not how the strings are created.
		 * == =>checks the value as well as type of string.
		 * 
		 */
		
		
	}

}
