import javax.swing.JOptionPane;

public class forloopgotlet {
public static void main(String[] args) {
	String sage = JOptionPane.showInputDialog("Enter your age: ");
	int age = Integer.parseInt(sage);
	int yearborn = 2016 - age;
	for (int i = 0; i < age; i++) {
		JOptionPane.showMessageDialog(null, yearborn );
		yearborn++;
	}
	}
}
