/**
* <h1> KelasDua Class </h1>
* This class will print default number and other numbers 
* based on KelasSatu Class that is called from the constructed object
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-25
*/

public class KelasDua {
	
	//instance initialization block that will be executed if an instance of the KelasDua constructed
	{
		System.out.println(5);
	}
	
	public static void main(String[] args)
	{
		System.out.println(6);  //print number 6 as the first code will be executed
		KelasSatu satu = new KelasSatu(); //construct new object satu of the KelasSatu class
		KelasSatu dua = new KelasSatu(10); //construct another new object dua of the KelasSatu class
	}

}
