package datatypes;
import java.util.*;

/**
* <h1>Determine Data Types</h1>
* This program will take an input from user 
* to check as many testcases as desired
* and for each testcase this program will
* determine which primitive data types are capable 
* of properly storing that input
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-11
*/


public class DataTypes {
	public static void main(String []args)
    {
		    Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        String[] input = new String[T];
	        long[] Convert = new long[T];
	        
	        for(int i=0;i<T;i++){
	            input[i]=scanner.next();
	        }  
	        scanner.close();
	        
			for(int i=0;i<T;i++) {
				try 
				{
	    			Convert[i] = Long.parseLong(input[i]); 
	    			System.out.println(Convert[i]+" can be fitted in: ");
	    			if(Convert[i]>=Byte.MIN_VALUE && Convert[i]<=Byte.MAX_VALUE){System.out.println("* byte");}
	    			if(Convert[i]>=Short.MIN_VALUE && Convert[i]<=Short.MAX_VALUE){System.out.println("* short");}
	    			if(Convert[i]>=Integer.MIN_VALUE && Convert[i]<=Integer.MAX_VALUE){System.out.println("* int");}
	    			if(Convert[i]>=Long.MIN_VALUE && Convert[i]<=Long.MAX_VALUE){System.out.println("* long");}
	    		}
	    		catch(NumberFormatException e)
	    		{
	    			System.out.println(input[i]+" can't be fitted anywhere.");
	    		}
			}
    }
}
			