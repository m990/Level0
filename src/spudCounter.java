import javax.swing.JOptionPane;

public class spudCounter {
	public static void main(String[] args) {
		String spatotos = JOptionPane.showInputDialog("How many patotos?");
		int patotos = Integer.parseInt(spatotos);
		patotos ++;
		for (int i = 1; i < patotos; i++) {
			System.out.println(i + "patotos");
		}
		System.out.println("and more!");
	}
}
