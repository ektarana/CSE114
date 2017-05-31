//abstract review

public abstract class Pokemon implements Comparable<Pokemon>, Cloneable{
	protected String name; 
	protected int pokeDex; 
	
	@Override
	public int compareTo(Pokemon o) {
		Pokemon other = (Pokemon)o;
		if (other.pokeDex > this.pokeDex){
			return -1;
		}else if (other.pokeDex < this.pokeDex){
			return 1;
		}
		else 
			return 0; 
	} 
	
	public abstract void eat(); 
	
	public void talk(){
		System.out.print(name + ", " + name);
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
		
	}



}
