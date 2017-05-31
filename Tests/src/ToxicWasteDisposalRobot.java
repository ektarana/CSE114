
public class ToxicWasteDisposalRobot extends WasteDisposalRobot{
	protected String wasteType;

	public ToxicWasteDisposalRobot(String name, String wasteType) {
		super(name);
		this.wasteType = wasteType;
	}
@Override
public void work(){
	System.out.println("ToxicWasteDisposalRobot " + name + " is cleaning up " + wasteType);
}

}