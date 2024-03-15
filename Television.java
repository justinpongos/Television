
public class Television {
	
	private String model;
	private Double price;
	
	public Television() {
		this.model = "Insignia";
		this.price = 79.99;	
	}//end zero argument
	
	public Television (String model, Double price) {
		this.model = model;
		this.price = price;
	}//end two argument constructor
	
	public String getModel() {
		return model;
	}//end getModel
	
	public void setModel(String model) {
		this.model = model;
	}//end setModel
	
	public Double getPrice() {
		return price;
	}//end getPrice
	
	public void setPrice(Double price) {
		this.price = price;
	}//end setPrice
	
	public String toString() {
		String output;
		output = "The price of this tv is " + price + ", its model is " + model;
		return output;
	}//end to String
}//end class
