package Rover;

import com.phidget22.*;

public class Sonar 
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
			
		leftMotors.open(2000);
		rightMotors.open(2000);
		sonar.open(2000);
		
			
		while(true)
		{
			System.out.println("Distance : " + sonar.getDistance() + " mm");
			
			if(sonar.getDistance() < 300)
			{
				leftMotors.setTargetVelocity(0);
				rightMotors.setTargetVelocity(0);
			}
			else
			{
				leftMotors.setTargetVelocity(-0.25);
				rightMotors.setTargetVelocity(-0.25);
			}
			
			Thread.sleep(250);		
		}		
	}

}
