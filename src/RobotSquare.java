import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot max = new Robot();


		// 3. Put the robot's pen down
		max.penDown();


		// 6. Make the robot move as fast as possible
		max.setSpeed(10);


		// 5. Do everything below here 4 times
		for (int i = 0; i < 5; i++) {
			
		

		// 		2. Move your robot 200 pixels
		max.move(200);

		// 		4. Turn the robot 90 degrees to the right (90 degrees)
		max.turn(90);

		}
	}
}