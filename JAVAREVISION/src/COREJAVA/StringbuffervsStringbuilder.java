package COREJAVA;

public class StringbuffervsStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long starttime=System.currentTimeMillis();
		
		StringBuffer str= new StringBuffer("dada");
		
		
		//System.out.println(str+" "+str2);
		 for(int i=0 ;i<10000;i++)
		 { 
			 str.append("dada");
		 }
		 System.out.println("time taken stringbuffer :"+(System.currentTimeMillis()-starttime));
		 
		 StringBuilder str2=new StringBuilder("dada");
		 long starttime2= System.currentTimeMillis();
		 for(int i=0;i<10000;i++)
		 {
			 str2.append("dada");
			
		 }
		 System.out.println("time taken by stringbuilder :"+(System.currentTimeMillis()-starttime2));
		
	}

}
