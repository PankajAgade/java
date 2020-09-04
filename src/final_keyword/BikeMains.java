package final_keyword;

public class BikeMains {

	public static void main(String[] args) {
		
		Bike2 obj = new Bike2();
		obj.Wheel();
		// Get Compile time error. Bike1 not access to final Method "Wheel()".
	}

}
