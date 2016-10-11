 import java.util.Random;

import javax.management.openmbean.OpenDataException;
import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		boolean win = false;
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99)+1;
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("What is your guess?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int iguess = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (iguess == random){
				JOptionPane.showMessageDialog(null, "You win!"); 
				win = true;
				break;
			}
				// 6. win
			// 7. if the guess is high
			if (iguess > random){
				JOptionPane.showMessageDialog(null, "To high");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			if (iguess < random){
				JOptionPane.showMessageDialog(null, "To low.");
			}
				// 10. tell them it's too low
		} 

		// 12. tell them they lose
		if (win == false){
			JOptionPane.showMessageDialog(null, "You loose...");
		}
	}

}
