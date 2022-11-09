package Rover;

import com.phidget22.DCMotor;
import com.phidget22.Net;

public class RCRover 
{

	public static void main(String[] args) throws Exception 
	{
		RemoteController cl = new RemoteController();
		
		Net.addServer("", "192.168.100.1", 5661, "", 0);
		
		DCMotor leftMotors = new DCMotor();
		DCMotor rightMotors = new DCMotor();
			
		leftMotors.setChannel(0);
		rightMotors.setChannel(1);
		rightMotors.setHubPort(5);
		leftMotors.setHubPort(5);
			
		leftMotors.open(5000);
			
		rightMotors.open(5000);
		
		cl.Setup();
		
		
		
		while(true)
		{
			System.out.println(cl.Horizontal());
			
			if(cl.Vertical() > 0.1 || cl.Vertical() < -0.1)
			{
				leftMotors.setTargetVelocity(cl.Vertical());
				rightMotors.setTargetVelocity(cl.Vertical());
			}
			else if(cl.Horizontal() > 0.1)
			{
				leftMotors.setTargetVelocity(-cl.Horizontal());
				rightMotors.setTargetVelocity(cl.Horizontal());
			}
			else if(cl.Horizontal() < 0.1)
			{
				leftMotors.setTargetVelocity(-cl.Horizontal());
				rightMotors.setTargetVelocity(cl.Horizontal());
			}
			else
			{
				leftMotors.setTargetVelocity(0);
				rightMotors.setTargetVelocity(0);
			}
			
		}

	}

}
