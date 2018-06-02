import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
	Popcorn f = new Popcorn(JOptionPane.showInputDialog("Popcorn flavor"));
	Microwave m = new Microwave();
	m.putInMicrowave(f);
	m.setTime(9);
	m.startMicrowave();
		
	}
}
