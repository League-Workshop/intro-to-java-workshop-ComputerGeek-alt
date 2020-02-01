package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot zoomer = new Robot();
		zoomer.setSpeed(30);
		zoomer.penDown();
		zoomer.move(100);
		zoomer.turn(90);
		zoomer.move(100);
		zoomer.turn(90);
		zoomer.move(100);
		zoomer.turn(90);
		zoomer.move(100);
		zoomer.turn(90);
	}	
}
