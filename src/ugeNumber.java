import java.util.Random;

public class ugeNumber {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9000000; i++) {
			int jerry = new Random().nextInt();
			if  (jerry > x){
				x = jerry;
			}
			if (jerry < y){
				y = jerry;
			}
		}
		System.out.println(x);
		System.out.println(y);
	}
}