package COREJAVA;

import java.util.Scanner;

public class Jaggedarray {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("please enter the rows for jagged array:");
		
		int rows=sc.nextInt();
		int[][] jagged =new int [rows][];
		
		for(int i=0;i<jagged.length;i++)
		{
			  System.out.println("for "+(i+1) +" row , enter columns.");
			  int num=sc.nextInt();
			jagged[i]=new int[num];
		}
		for(int i=0;i<jagged.length;i++)
		{
			for(int j=0;j<jagged[i].length;j++)	
			{
			  System.out.println("columns for "+ (i+1)+ " row are "+jagged[i].length);
			  System.out.println("enter "+ (j+1) +"element");
			//  int element;
			  jagged[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<jagged.length;i++)
		{
			for(int j=0;j<jagged[i].length;j++)	
			{
			  
			  System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
       
	}

}
