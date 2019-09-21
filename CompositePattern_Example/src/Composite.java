import java.util.ArrayList;

public class Composite implements Component{

	//Attributes
	private ArrayList<Leaf> items;

	//Constructor
	public Composite() {
		items= new ArrayList<Leaf>(); 
	}

	//compPrice method 	
	public Double compPrice() {
		Double totalcost = 0.0;
		for(Leaf temporalvariable: items )
		{
			totalcost += temporalvariable.compPrice();
		}

		return totalcost;
	}

	//add method 
	public void addItem(Leaf item){
		items.add(item);
	}

	//remove method
	public void removeItem(Leaf item){
		items.remove(item);
	}

	// display
	public String toString() {
		for(Leaf temporalvariable: items)
		{
			System.out.println(temporalvariable);
		}

		return "";
	}


}




