import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int age2 = Integer.parseInt(age);
		int presentYear = 2016;
		for (int year = 0; year <= age2; year++) {
			JOptionPane.showMessageDialog(null, presentYear - age2);
			presentYear++;
		}
	}
}
