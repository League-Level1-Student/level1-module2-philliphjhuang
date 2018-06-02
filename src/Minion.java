
public class Minion {
	public Minion(String name, int eyes, String color, String master) {
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	
	
	public static void main(String[] args) {
	MinionTest MT = new MinionTest();
	MT.testConstructor();
	MT.testSetters();
		
		
	}
}
