//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #6 : Wolfie’s Car Repair Shop

public class CarRepairShop {	
	private static Car[] arrOfCars = new Car[3];
	private static Ticket[] arrOfTickets = new Ticket[3];
	private static int carCounter = 0; //tracks number of cars in array
	private static int ticketNumb = 0; //is the ticket number 
	
//1
	public int addNewCar(String vin, String make, int year) {
		//check if array is full
		if(carCounter==arrOfCars.length-1){
			arrOfCars = makeCarArrayBigger(arrOfCars);
		}
		if(!vinExists(vin)){
			arrOfCars[carCounter] = new Car(vin, make, year); 
			carCounter++;
			return carCounter;
		}
		else
			return -1;	
	}
//2	
	public int addRepairTicket(String vin, double cost, String description) {
		//check if array is full
				if(ticketNumb==arrOfTickets.length-1){
					arrOfTickets=makeTicketArrayBigger(arrOfTickets);
				}
		if(vinExists(vin)){
			ticketNumb++;
			arrOfTickets[ticketNumb-1] = new Ticket(vin, cost, description); 
			return ticketNumb;
		}
		else
			return -1;		
	}
//3
	public double getRepairCost(int ticketNum) {
		if (ticketNum<=0 || ticketNum>ticketNumb){
			return -1.0;
		}
		if(arrOfTickets[ticketNum-1]!=null){
			return arrOfTickets[ticketNumb-1].getCost();	
		}else
			return -1.0;
			
	}
//4
	public double getTotalRepairCosts(String vin) {
		double total = 0.0; 
		if (vinExists(vin)){
			for (int i=0; i<arrOfTickets.length; i++){
				if(arrOfTickets[i]!=null){
				if(vin.equals(arrOfTickets[i].getVin())){
					total += arrOfTickets[i].getCost();
					}	
			}}	
		return total; 
		}else 
			return -1.0;
	}
//5
	public String getWorstCarMake() {
		int count = 0, largestVinCount=0;
		String largestVin=""; 
		for (int i = 0; i<arrOfTickets.length; i++){
			count = 0;
			if(arrOfTickets[i]!=null){
				for(int j = 0; j<arrOfTickets.length; j++){
					if(arrOfTickets[j]!=null){{
						if(arrOfTickets[i].getVin().equals(arrOfTickets[j].getVin())){ 
							count++;
							if(count>largestVinCount){
								largestVin = arrOfTickets[i].getVin(); 
								}
							}
						}
					}
				}
			}	
		}
		for (int i=0; i<arrOfCars.length; i++){
			if(arrOfCars[i]!=null){
				if(arrOfCars[i].getVin().equals(largestVin)){
					return arrOfCars[i].getMake();
				}
			}
		}
		return null;
	}
//6
	public boolean updateRepairCost(int ticketNum, double newCost) {
		if (ticketNum<=0 || ticketNum>ticketNumb){
			return false;
		}else {
			arrOfTickets[ticketNum-1].cost = newCost;
			return true;
		}
	}
//7
	public boolean deleteRepair(int ticketNum) {
		if (ticketNum<=0 || ticketNum>ticketNumb){
			return false;
		}else {
			arrOfTickets[ticketNum-1] = null;
			return true;
		}
	}
//8	
	public boolean deleteAllRepairsForCar(String vin) {
		if(!vinExists(vin)){
			return false;
		}else{
			for (int i = 0; i<arrOfTickets.length; i++){
				if (arrOfTickets[i]!=null){
					if (arrOfTickets[i].getVin().equals(vin)){
						arrOfTickets[i] = null;
					}		
				}
			}
			return true;
		}
	}
//9
	public boolean deleteCarAndRepairs(String vin) {
		if(vinExists(vin)){
			deleteAllRepairsForCar(vin);
			for (int i = 0; i<arrOfCars.length; i++){
				if (arrOfCars[i]!=null){
					if (arrOfCars[i].getVin().equals(vin)){
						arrOfCars[i] = null;
						return true;
					}
				}
			}
		}
		return false;
	}
//easy check for vin existence	
	public boolean vinExists(String vin) {
		for (int i=0; i < arrOfCars.length; i++) {
			if (arrOfCars[i] != null) {
				if (arrOfCars[i].vin.equals(vin)) {
					return true;
				}
			}
		}
		return false;
	}	
//these two methods ensure that the array is never out of bounds
	public Car[] makeCarArrayBigger(Car[] basicArray){
		Car[] newArray = new Car[basicArray.length+100];
		System.arraycopy(basicArray, 0, newArray, 0, basicArray.length);
		basicArray = newArray; 
		return basicArray; 	
	}
	public Ticket[] makeTicketArrayBigger(Ticket[] basicArray){
		Ticket[] newArray = new Ticket[basicArray.length+100];
		System.arraycopy(basicArray, 0, newArray, 0, basicArray.length);
		basicArray = newArray; 
		return basicArray; 	
	}
}
