import java.util.Random;

import javax.swing.JOptionPane;

public class DrinkOnTheWall {
	public static void main(String[] args) {
		String drink = JOptionPane.showInputDialog("What drink do you want?");
		for (int i = 100; i > 0; i-=2) {
			Random max = new Random();
			int bottles = max.nextInt(100);
			System.out.println(bottles + " bottles of " + drink + " on the wall, " + bottles + " bottles of " + drink + ", take it down pass it around. " + (bottles) + " bottles of " + drink + " on the wall.");
		}
	}
}
