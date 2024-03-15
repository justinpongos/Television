
public class LED extends Television {
	private int responseTime; 
	public LED() {
		this.responseTime = 10;
	}//end zero argument constructor
	
	public LED(String model, double price, int responseTime) {
		super(model, price);
		this.responseTime = responseTime;
	}//end three argument constructor
	
	public int responseTime() {
		return responseTime;
	}//end getter
	
	public String toString() {
		String output = super.toString();
				output += " with " + responseTime + "ms response time";
		return output;
	}//end toString
}//end class

