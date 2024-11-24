import java.io.*;
import java.util.*;

public class file {

  public static void copyf(File a,File b) 
  	throws Exception
  {
  	FileInputStream fis=new FileInputStream(a);
  	FileOutputStream fos=new FileOutputStream(b);
  	
  	try{
  		int n;
  		while((n=fis.read())!=-1)
  		{
  			fos.write(n);
  		}
  	}
  	finally
  	{
  		if(fis!=null)
  		{
  			fis.close();
  		}
  		if(fos!=null)
  		{
  			fos.close();
  		}
  		System.out.println("File copy succcessfully...");
  	}
  }
  
  public static void main(String args[]) throws Exception
  {
  	
  		Scanner sc=new Scanner(System.in);
  		System.out.println("Enter read file name:");
  		String a=sc.nextLine();
  			File x=new File(a);
  		System.out.println("Enter write data in file name:");
  		String b=sc.nextLine();
  		
  	
  		File y=new File(b);
  		
  		copyf (a ,b);
  		
  		
  		
  }
    
}