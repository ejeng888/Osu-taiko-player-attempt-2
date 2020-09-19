package click;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.Color;

//for rotating circle in regular osu

public class SimulateMouse{
	static boolean running = true;
	static void buttonPress() {
		try {
			  Frame frame = new Frame("Example Frame");
			  Component textArea = new TextArea();
			  frame.add(textArea, BorderLayout.CENTER);

			  int width = 300;
			 
			  int height = 300;
			 
			  frame.setSize(width, height);
			 
			  frame.setVisible(true);
			  // Move the cursor
			 
			  Robot robot = new Robot();
			 
			  for(int i = 0; i != 100; ++i) {
				  robot.mouseMove(50, 100);
				  try {
					    Thread.sleep(1500);
					} catch(InterruptedException e) {
					    System.out.println("got interrupted!");
					}
				  robot.mouseMove(100, 100);
				  try {
					    Thread.sleep(1500);
					} catch(InterruptedException e) {
					    System.out.println("got interrupted!");
					}
				  robot.mouseMove(100, 200);
				  try {
					    Thread.sleep(1500);
					} catch(InterruptedException e) {
					    System.out.println("got interrupted!");
					}
				  robot.mouseMove(50, 200);
				  try {
					    Thread.sleep(1500);
					} catch(InterruptedException e) {
					    System.out.println("got interrupted!");
					}
			  }
			 
			  
		} catch(AWTException e) {

			
			e.printStackTrace();
			
		}
	}
	public void keyPressed(KeyEvent evt) {
		int key = evt.getKeyCode();
		if(key == KeyEvent.VK_SHIFT) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		buttonPress();
	}
}

