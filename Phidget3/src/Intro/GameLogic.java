package Intro;

import com.phidget22.*;

public class GameLogic
{
	static DigitalInput redButton;
	static DigitalInput greenButton;
	
	public static void ControllerInitializion() throws PhidgetException
	{
		redButton = new DigitalInput();
        greenButton = new DigitalInput();
		
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		
		redButton.open(1000);
		greenButton.open(1000);
	}
	
	public static boolean redButtonInput() throws PhidgetException
	{
		return(redButton.getState());
	}
	public static boolean greenButtonInput() throws PhidgetException
	{
		return(greenButton.getState());
	}
}
