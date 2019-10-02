/*  The singleton pattern is a design pattern that restricts the instantiation of a class to one object. 
This is useful when exactly one object is needed to coordinate actions across the system."

https://www.hackerrank.com/challenges/java-singleton/problem  */

public class Singleton {

	//Make a static variable of Singleton because, 
	//for static variables, memory allocation happens only once. 
	//This variable is the access point.
	private static Singleton instance = null;
	protected String message;
	//We make the constructor private so, there is only one instance of the class.
	private Singleton() {}

	public static Singleton getInstance() {
		//Check if there is no instance of the object
		if(instance==null) {
			//If there is no previous instance, we  instantiate  the class. 
			instance= new Singleton();
		}		
		return instance;
	}


	//Test
	public static void main(String []args)
	{
		Singleton a = new Singleton();
		Singleton b = new Singleton();
		a.getInstance().message = "Hello world";

		// Both print the same because references a and b are pointing to the same object.
		System.out.println(a.getInstance().message);
		System.out.println(b.getInstance().message);



	}

}
