package Rover;

import com.phidget22.*;

public class Rover1 
{

	public static void main(String[] args) throws Exception
	{
		Net.addServer("", "192.168.100.1", 5661, "", 0);
		
		DCMotor leftMotors = new DCMotor();
		DCMotor rightMotors = new DCMotor();
		
		leftMotors.setChannel(0);
		rightMotors.setChannel(1);
		rightMotors.setHubPort(5);
		leftMotors.setHubPort(5);
		
		leftMotors.open(5000);
		
		rightMotors.open(5000);
	
		
		leftMotors.setTargetVelocity(-1);
		rightMotors.setTargetVelocity(-1);
		
		Thread.sleep(5000);
		
		leftMotors.setTargetVelocity(0);
		rightMotors.setTargetVelocity(0);	
		
	}

}
