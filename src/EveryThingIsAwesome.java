import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
	public static void main(String[] args) {
		String awesome = JOptionPane.showInputDialog(null, "Say something.");
		JOptionPane.showMessageDialog(null, awesome + " is awesome.");
	}
}
