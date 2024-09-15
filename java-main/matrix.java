
import java.util.*;


public class matrix {

   
   public static void main (String[] args) {
   	
   	int row,col,i,j,k,mul=0;
   	Scanner  s=new Scanner(System.in);
   	try{
   		
		   	System.out.print("Enter the number of row:");
		   	row=s.nextInt();
		   	System.out.print("Enter the number of column:");
		   	col=s.nextInt();
		   	
		   	int mat1[][]=new int[row][col];
		   	int mat2[][]=new int[row][col];
		   	int res[][]=new int[row][col];
		   	
		   	   	
		   		
		   	System.out.println("Enter element in matrix-1");
		   	for(i=0;i<row;i++)
		   	{
		   		for(j=0;j<col;j++)
		   		{
		   			mat1[i][j]=s.nextInt();
		   		}
		   	}
		   	
		   	System.out.println("Enter element in matrix-2");
		   	
		   	for(i=0;i<row;i++)
		   	{
		   		for(j=0;j<col;j++)
		   		{
		   			mat2[i][j]=s.nextInt();
		   		}
		   	}
		   	
		   	System.out.println("Addition of mat-1 and mat-1");
		   	for(i=0;i<row;i++)
		   	{
		   		for(j=0;j<col;j++)
		   		{
		   			res[i][j]=mat1[i][j] + mat2[i][j];
		   			System.out.print(res[i][j]+" ");
		   		}
		   		System.out.println("");
		   	}
		   	
		   	System.out.println("Subtraction of matrix-1 and matrix-2");
		   	for(i=0;i<row;i++)
		   	{
		   		for(j=0;j<col;j++)
		   		{
		   			res[i][j]=mat1[i][j] - mat2[i][j];
		   			System.out.print(res[i][j]+" ");
		   		}
		   		System.out.println("");
		   	}
		   	
		   	System.out.println("\nMatrix Multipllication \n");
		   	for(i=0;i<row;i++)
		   	{
		   		for(j=0;j<col;j++)
		   		{
		   			for(k=0;k<row;k++)
		   			{
		   				mul+=mat1[i][k]*mat2[k][j];
		   				
		   			}
		   			res[i][j]=mul;
		   			mul=0;
		   		
		   		}
		   	}
		   	
		   	for(i=0;i<row;i++)
		   	{
		   		for(j=0;j<col;j++)
		   		{
		   			System.out.print(res[i][j]+" ");
		   		}
		   		System.out.println("");
		   	}
		   	
   	
   	}
   	catch(Exception e)
   	{
   		System.out.println("\nPlease Enter only integer value...");
   	}
   	
   	
}
    
    
}