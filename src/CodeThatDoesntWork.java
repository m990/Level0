import javax.swing.JOptionPane;

public class CodeThatDoesntWork {
	public static void main(String[] args) {
		String word = JOptionPane.showInputDialog("Enter a word");
		if (word.length() > 7){
			JOptionPane.showMessageDialog(null, "That is a big word.");
		}
		else{
			JOptionPane.showMessageDialog(null, "That is a small word.");
		}
	}
}
