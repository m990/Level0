 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


public class BirthdayReminder {


	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String geddyLeesBirthday = "July 29th";
		String neilPeartsBirthday = "September 12th";
		String AlexLifesonBirthday = "August 27th";
		String theOtherDude = "June 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog("Witch birthday do you want to use? Geddy Lee, Alex Lifeson, or Neil Perts birthday.");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday.equals("Geddy Lee")){
			JOptionPane.showMessageDialog(null, geddyLeesBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthday.equals("Neal Peart")){
			JOptionPane.showMessageDialog(null, neilPeartsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (birthday.equals("Alex Lifeson")){
			JOptionPane.showMessageDialog(null, AlexLifesonBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else if (birthday.equals("The Donald") || birthday.equals("Donald Trump")){
			JOptionPane.showMessageDialog(null,theOtherDude);
		}
		else{
			JOptionPane.showMessageDialog(null, "Don't know him.");
		}


	} 
}