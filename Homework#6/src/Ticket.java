//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #6 : Wolfie’s Car Repair Shop


public class Ticket {
	private String vin;
	double cost;
	private String description;  

	public Ticket(String vin, double cost, String description){
		this.vin = vin;
		this.cost = cost;
		this.description = description;
	}
	
	public String getVin(){
		return vin;
	}
	public double getCost(){
		return cost;
	}
	public String getDescription(){
		return description;
	}
}

