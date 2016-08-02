import javax.swing.JOptionPane;

public class airline {
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog("Enter your first name.");
		String lastName = JOptionPane.showInputDialog("Enter your last name:");
		String destinationAirport = JOptionPane.showInputDialog("Enter your destination airport.");
		String birthday = JOptionPane.showInputDialog("Enter your birthday.");
		String gender = JOptionPane.showInputDialog("Are you male or female?");
		System.out.println(lastName + ", " + firstName + "(" + birthday + ", " + gender + " )" + "\n" + "DESTINATION" + destinationAirport);
	}
}
