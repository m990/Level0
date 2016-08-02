import org.jointheleague.graphical.robot.Robot;

public class newClass {
	public static void main(String[] args) {
		Robot Max = new Robot();
		Max.penDown();
		Max.setSpeed(10);
		Max.hide();
		// First letter
		Max.move(400);
		Max.turn(150);
		Max.move(400);
		Max.turn(-150);
		Max.move(400);
		Max.turn(150);
		Max.move(400);
		// Second letter
		Max.penUp();
		Max.move(450);
		Max.turn(180);
		Max.penDown();
		Max.move(400);
		Max.turn(-120);
		Max.move(400);
		Max.turn(180);
		Max.penUp();
		Max.move(400);
	}
}
