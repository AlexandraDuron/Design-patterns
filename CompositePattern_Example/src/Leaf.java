
public class Leaf implements Component{

	//Attributes
	private String name;
	private Double price;

	//Constructor 
	public Leaf(String name, Double price) {

		this.name=name;
		this.price=price;
	}

	// compPrice method 	
	public Double compPrice() {

		return price;

	}

	// display
	public String toString() {
		return "" + name + " "+ price;
	}

}
