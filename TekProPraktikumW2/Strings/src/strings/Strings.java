package strings;
import java.util.*;

public class Strings {
	
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String String1 = scanner.next();
        String String2 = scanner.next();
        scanner.close();
        System.out.println(String1.length() + String2.length());
        
        if(String1.compareTo(String2) > 0){
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }
        
        String temp1 = String1.substring(0,1).toUpperCase() + String1.substring(1);
        String temp2 = String2.substring(0,1).toUpperCase()+ String2.substring(1);;
        System.out.println(temp1 + " " + temp2);
    }
	
}
