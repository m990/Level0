import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class zorkGame {
	public static void main(String[] args) {
		String answer;
		String answer1;
		Scanner max = new Scanner(System.in);
		Random maxn = new Random();
		System.out.println("Do you want to exit throught the door or the window?");
		max.nextLine();
		System.out.println("So you've exited, now do you want to run for your life or rob some one?");
		answer = max.nextLine();
		if (answer.equals("rob")){
			System.out.println("You try to rob some one, but the poliece catch up to you. Do you run, or do you surrender.");
			answer1 = max.nextLine();
			if (answer1.equals("run")){
				int number = maxn.nextInt(2);
					if (number == 0){
						System.out.println("You get away, but there are more cops at your house. The End.");
					}
					else{
						System.out.println("The End.");
					}
					}
				}
			
		
		else{
			System.out.println("You run for your life but you get cought... The End.");
		}
	}
		
	}
