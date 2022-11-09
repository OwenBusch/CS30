package Rover;

import com.phidget22.DCMotor;
import com.phidget22.DistanceSensor;
import com.phidget22.Net;

public class Challenge 
{
	public static void main(String[] args) throws Exception 
	{
		Net.addServer("", "192.168.100.1", 5661, "", 0);
			
		DCMotor leftMotors = new DCMotor();
		DCMotor rightMotors = new DCMotor();
		DistanceSensor sonar = new DistanceSensor();
			
		leftMotors.setChannel(0);
		rightMotors.setChannel(1);
		sonar.setHubPort(3);
		rightMotors.setHubPort(5);
		leftMotors.setHubPort(5);
			
		leftMotors.open(7000);
		rightMotors.open(7000);
		sonar.open(2000);
		
		leftMotors.setTargetVelocity(-1);
		rightMotors.setTargetVelocity(-1);
		
		Thread.sleep(1700);	
		
		leftMotors.setTargetVelocity(0);
		rightMotors.setTargetVelocity(0);
		
		Thread.sleep(1000);
		
		leftMotors.setTargetVelocity(0.5);
		rightMotors.setTargetVelocity(-0.5);
			
		Thread.sleep(1000);
			
		/*while(true)
		{
			System.out.println("Distance : " + sonar.getDistance() + " mm");
			
				
		}*/		
	}
}
