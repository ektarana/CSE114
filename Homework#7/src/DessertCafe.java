//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #7: Part I: Sugary Goodness
import java.util.ArrayList; 

public class DessertCafe {
	public static void main(String[] args) {	
/*Inside of your DessertCafe class write a main() method that defines an ArrayList of Dessert references:
ArrayList<Dessert> desserts. Due to polymorphism you can store objects of any subclass
of Dessert inside this ArrayList. Create two objects of every type of subclass of Dessert (i.e., Cake,
CookiePack, IceCream and Sundae). Pick appropriate arguments (actual values) for each constructor when
you construct each object. Add these objects in any order to the ArrayList. Finally, write a for-loop that
iterates over the ArrayList, printing the name and cost of every dessert item in the collection by calling the
getName() and getCost() methods.*/
		
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		//bake cakes and add to desserts
		Cake cake1 = new Cake("Chocolate cake", 10);
		Cake cake2 = new Cake("Vanilla", 2);
		desserts.add(cake1);
		desserts.add(cake2);
		//bake cookies
		CookiePack cookie1 = new CookiePack("penut butter", 5, 1); 
		CookiePack cookie2 = new CookiePack("oreo", 5, 1);
		desserts.add(cookie1);
		desserts.add(cookie2);
		//add icecream
		IceCream ice1 = new IceCream("strawberry", 3);
		IceCream ice2 = new IceCream("orange", 3);
		desserts.add(ice1);
		desserts.add(ice2);
		//add sundaes
		Sundae sun1 = new Sundae("vanilla", 3, 2);
		Sundae sun2 = new Sundae("neopolitan", 3, 1);
		desserts.add(sun1);
		desserts.add(sun2);

		for(Dessert d: desserts) {
            System.out.println(d.getName() + " $"+ d.getCost());
	}
}
}
abstract class Dessert {
	protected String name; 
	protected int cost; 
	//methods
	public abstract String getName();
	public abstract int getCost();
	@Override
	public String toString(){
		return name + " $" + cost;
	}
	
}
/*The Cake class is derived from the Dessert class. A Cake object has a number of layers (int). The
price of a cake is $15 + $2 per layer. For example, a 3-layer cake costs $21. The number of layers is passed
as the parameter to the Cake constructor.*/

class Cake extends Dessert{
	private int layers; 
	
	public Cake(String name, int numLayers){
		this.name = name; 
		this.layers = numLayers;
	}	
//override these methods
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Cake)
			return (this.getName().equals(((Cake)obj).name) && this.getCost() == ((Cake)obj).cost);
		return false; 
	}
	@Override
	public String getName(){
		return name; 
	}
	@Override
	public int getCost(){
		this.cost = 15 + (2*layers);
		return cost; 
	}		
}

/*The CookiePack class is derived from the Dessert class. A CookiePack object has a number (int)
indicating how many cookies are in the pack and a price per cookie in dollars (int) which are used to
determine its cost. For example, a 5-cookie pack at $2 per cookie = $10. The name/type of the cookies
(e.g., Chocolate chip cookies) and these two integers are passed in as the parameters to the CookiePack
constructor.*/ 

class CookiePack extends Dessert{
	private int cip;
	private int ppc;

	public CookiePack(String name, int cookiesInPack, int pricePerCookie){
		this.name = name; 
		cip = cookiesInPack;
		ppc = pricePerCookie; 
	}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof CookiePack)
			return (this.getName().equals(((CookiePack)obj).name) && this.getCost() == ((Cake)obj).cost);
		return false; 
	}
	@Override
	public String getName(){
		return name; 
	}
	@Override
	public int getCost(){
		cost = cip*ppc;
		return cost; 
	}
}
/*The IceCream class is derived from the Dessert class. An IceCream object simply has a cost in
dollars (int). The starting value of this cost is passed as the parameter to the IceCream constructor.*/

class IceCream extends Dessert{
	public IceCream(String name, int cost){
		this.name = name;  
		this.cost = cost;
	}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof IceCream)
			return (this.getName().equals(((IceCream)obj).name) && this.getCost() == ((IceCream)obj).cost);
		return false; 
	}
	@Override
	public String getName(){
		return name; 
	}
	@Override
	public int getCost(){
		return cost; 
	}

}
/*The Sundae class is derived from the IceCream class. The cost of a Sundae is the cost of the
IceCream plus the cost of the topping in dollars (int). The starting value of the topping’s cost is passed
as a parameter to the Sundae constructor.*/

class Sundae extends IceCream{
	public Sundae(String name, int cost, int toppingCost) {
		super(name, cost);
		this.name = name;  
		this.cost = cost + toppingCost;	
		}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Sundae)
			return (this.getName().equals(((Sundae)obj).name) && this.getCost() == ((Sundae)obj).cost);
		return false; 
	}
	@Override
	public String getName(){
		return name; 
	}
	@Override
	public int getCost(){
		return cost; 
	}
}
