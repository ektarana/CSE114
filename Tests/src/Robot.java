//Quiz 11B practice 
public class Robot {
	protected String name;

	public Robot(String name) {
		this.name = name;
	} 
	public void start(){
		System.out.println("Robot " + name + " started");
	}
	public void stop(){
		System.out.println("Robot " + name + " stopped");
	}
	public void work(){
		System.out.println("Robot " + name + " working");
	}
}
