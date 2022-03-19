/**
* <h1> Item Class </h1>
* This class contain a method that will display the string
* after executing the method
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-25
*/

public class Item {
	
	private String name;
	
	/* Constructor */
	private Item() {
		name = "Ipin";
	}
	
	public Item(String name) {
		System.out.println(this.name = new Item().name.toLowerCase()); 
		//make variable "this.name" assigned by the constructor item which contain the 
		//assignment of variable name by the String "Ipin"
	}

}


