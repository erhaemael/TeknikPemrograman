import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TipeData {
	static String whoCanFitTheNumber(String numString)
    {
        String answer = "";
        try{
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                answer = answer.concat("* byte\n* short\n* int\n* long");
            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    answer = answer.concat("* int\n* long");
            }else{
                    answer = answer.concat("* long");
            }
        }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
    }

	public static void main(String []argh)
    {
		    Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt() ;
	        scanner.nextLine();
	        String[] N = new String[t] ;
	        for(int i=0; i<t;i++){
	          //  String[] N = new String[t] ;
	            N[i]=scanner.nextLine();
	        }
	        for(int j=0; j<t;j++){
	        System.out.println(whoCanFitTheNumber(N[j]));
    }
}
}










