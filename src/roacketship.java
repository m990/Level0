import java.io.IOException;

public class roacketship {
	public static void main(String[] args) throws InterruptedException, IOException {
		for (int j = 10; j > 0; j--) {
			
		Runtime.getRuntime().exec("say " + j).waitFor();
		}
		Runtime.getRuntime().exec("say " + "Blast off!");
	}
}
