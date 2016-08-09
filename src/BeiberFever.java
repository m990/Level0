import javax.swing.JOptionPane;
import java.io.IOException;

public class BeiberFever {
	public static void main(String[] args) {
		int ohno = 0;
		for (int i = 0; i < 3; i++) {
				
			
			speak("Baby");
			if (i == 2){
				if (ohno == 0){
					speak("Oh");
				}
				if (ohno == 1){
					speak("No");
				}
				speak("I thought you'd always be mine");
				if (ohno == 0){
					ohno++;
				}
				if (ohno == 1){
					ohno--;
				}
			}}
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
}
}}