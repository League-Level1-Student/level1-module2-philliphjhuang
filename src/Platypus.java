import javax.swing.JOptionPane;

public class Platypus {
	
	
	private String name;

  	void sayHi(){
        	System.out.println("The platypus " + name + " is smarter than your average platypus.");
  	}
	
	Platypus() {
		
		name = JOptionPane.showInputDialog("Name");
		
		
	}
	
	
	
}
