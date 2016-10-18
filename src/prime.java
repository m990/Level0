import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		String snumber = JOptionPane.showInputDialog("Enter a number");
		int number = Integer.parseInt(snumber);
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0){
				JOptionPane.showMessageDialog(null, "Composite");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Prime.");
	}
}
