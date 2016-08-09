import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String summer = JOptionPane.showInputDialog("What did you do last summer?");
		String name = JOptionPane.showInputDialog("What is you name?");
		JOptionPane.showMessageDialog(null, name + " did " + summer + ".");
	}
}
