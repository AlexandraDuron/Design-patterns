
public class TestCompositePattern {

	public static void main(String[] args) {

		// Item objects (leaf) 
		Leaf pencil = new Leaf("Pencil",1.5);
		Leaf book = new Leaf("Book",40.0);
		Leaf glue = new Leaf("Glue",2.0);

		// Create a composite object
		Composite listOfItems = new Composite();
		// Add items to the list
		listOfItems.addItem(pencil);
		listOfItems.addItem(book);
		listOfItems.addItem(glue);
		System.out.println(listOfItems+"Total cost: "+listOfItems.compPrice());

	}

}
