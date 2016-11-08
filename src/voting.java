import javax.swing.JOptionPane;

public class voting {
	public static void main(String[] args) {
		String canadate = JOptionPane.showInputDialog("Who are you voting for?");
		if (canadate.equals("Hilary Clinton")){
			JOptionPane.showMessageDialog(null, "She doesn't know how to send an email!");
		}
		else if (canadate.equals("Donald Trump")){
			JOptionPane.showMessageDialog(null, "A vote for Trump is a vote for the wall.");
		}
		else if (canadate.equals("Jill Stein")){
			JOptionPane.showMessageDialog(null, "Envormental Issues.");
		}
		else if (canadate.equals("Gary Johnsten")){
			JOptionPane.showMessageDialog(null, "Vlademer Poden");
		}
	}
}
