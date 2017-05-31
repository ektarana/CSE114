//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #6 : Wolfie’s Car Repair Shop


public class Car {
	String vin;
	String make;
	int year;  

public Car(String vin, String make, int year) {
	this.vin = vin;
	this.make = make;
	this.year =year;	
}
public String getVin(){
	return vin; 	
}
public String getMake(){
	return make; 	
}
public int getYear(){
	return year; 	
}
}