package click;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.Color;

//red is (235,69,44)
//blue is (67,142,172)
//using custom taiko skin clear skin ultra 3.0 classic blue

public class Button{
	static boolean running = true;
	static void buttonPress() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		try {
			//click on around 300,500
			Robot robot = new Robot();
			Color color = robot.getPixelColor((int) (height/2.2), (int) (width/4));
			Color red =  new Color(235,69,44);
			Color blue = new Color(67,142,172);


			//getRGB gets sum of the values, not good practice
			if(color.getRGB() == red.getRGB()) {
				robot.keyPress('W');
				robot.keyRelease('W');
				System.out.println("Red");
			}
			else if(color.getRGB() == blue.getRGB()) {
				robot.keyPress('E');
				robot.keyRelease('E');
				System.out.println("blue");
			}

			buttonPress();

		} catch(AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		while(running == true) {
			buttonPress();
		}
	}
}

