
public class FourK extends Television {
	private boolean isHDR; 
	public FourK() {
		this.isHDR = true;
	}//end zero argument constructor
	
	public FourK(String model, double price, boolean isHDR) {
		super(model, price);
		this.isHDR = isHDR;
	}//end three argument constructor
	
	public boolean isHDR() {
		return isHDR;
	}//end getter
	
	public String toString() {
		String output = super.toString();
			if (isHDR == true) {
				output += " with HDR";
			}//end if
			else {
				output += " without HDR";
			}//end else
		return output;
	}//end toString
}//end class
