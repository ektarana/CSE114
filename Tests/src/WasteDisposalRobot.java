
public class WasteDisposalRobot extends Robot{
	public WasteDisposalRobot(String name){
		super(name);  //you need this because there's no default constrcutor in the parent
	}

	@Override
	public void work(){
		System.out.println("WasteDisposalRobot " + name + " is working");
	}
	
	
	
}
