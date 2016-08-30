import java.util.regex.PatternSyntaxException;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class car {
	public static void main(String[] args) {
		int price = 0;
		String model =  JOptionPane.showInputDialog("What model car do you want?");
		String color = JOptionPane.showInputDialog("What color car do you want?");
		String make = JOptionPane.showInputDialog("What make do you want?");
		String syear = JOptionPane.showInputDialog("What year do you want your car to be?");
		int year = Integer.parseInt(syear);
		if (make == "Honda"){
			price = 20000;
		}
		if (make == "Toyota"){
			price = 20000;
		}
		if (make == "Ford"){
			price = 20000;
		}
		if (make == "Hondi"){
			price = 20000;
		}
		if (make == "Tesla"){
			price = 50000;
		}
		if (make == "Cheese"){
			price = 0;
			
		}
		if (year > 2010){
			price = price + 2000;
		}
		JOptionPane.showConfirmDialog(null, "You want a " + color + " " + make + " " + model + " for " + price);
	}
}
