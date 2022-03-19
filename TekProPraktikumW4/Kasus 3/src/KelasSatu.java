/**
* <h1> KelasSatu Class </h1>
* This class contains initialization block and constructor block
* that will be executed when an instance of this class constructed
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-25
*/

public class KelasSatu {
	
	//Instance Initialization Block
	//non-static
	//IIB is executed before constructors
	//it runs each time when an instance of the class is constructed
	{
		System.out.println(11);
	}
	
	//Static Initialization Block
	//that only gets called once, when the class itself is initialized, 
	//no matter how many objects of that type you create
	static
	{
		System.out.println(2);
	}
	
	//constructor will run after the initialization block executed
	
	//parameterized constructor 
	//used to initialize fields of the class with our own values that will be 
	//executed if the fields of the class has an integer parameter
	public KelasSatu(int i)
	{
		System.out.println(3);
	}
	
	//no-argument constructor
	public KelasSatu()
	{
		System.out.println(4);
	}

}
