//this the driver 
public class RobotFactory {
	public static void main(String[] args){
	Robot r1 = new Robot("Eva");
	r1.start();
	r1.work();
	r1.stop();

	Robot r2 =  new WasteDisposalRobot("Wall-E");
	r2.work();
	
	r2 = new ToxicWasteDisposalRobot("Wall-A", "plant"); 
	
	r2.work();
	
	}
}