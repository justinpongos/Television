
public class DLP extends Television {
	private double maxProjectedScreenSize; 
	public DLP() {
		this.maxProjectedScreenSize = 300.0;
	}//end zero argument constructor
	
	public DLP(String model, double price, double maxProjectedScreenSize) {
		super(model, price);
		this.maxProjectedScreenSize = maxProjectedScreenSize;
	}//end three argument constructor
	
	public double maxProjectedScreenSize() {
		return maxProjectedScreenSize;
	}//end getter
	
	public String toString() {
		String output = super.toString();
				output += " with a " + maxProjectedScreenSize + " inch max screen size";
		return output;
	}//end toString
}//end class

