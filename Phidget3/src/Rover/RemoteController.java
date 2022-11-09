package Rover;

import com.phidget22.*;

public class RemoteController
{
	static VoltageRatioInput HorizontalAxis;
	static VoltageRatioInput VerticalAxis;
	
	
	static void Setup() throws Exception
	{
		try
		{
			HorizontalAxis = new VoltageRatioInput();
			VerticalAxis = new VoltageRatioInput();
			
			HorizontalAxis.setChannel(1);
			VerticalAxis.setChannel(0);
			
			HorizontalAxis.setHubPort(2);
			VerticalAxis.setHubPort(2);
			
			HorizontalAxis.open(1000);
			VerticalAxis.open(1000);
			
			HorizontalAxis.setDataInterval(HorizontalAxis.getMinDataInterval());
			VerticalAxis.setDataInterval(VerticalAxis.getMinDataInterval());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static double Horizontal() throws Exception
	{
		return(HorizontalAxis.getVoltageRatio());
	}
	
	public static double Vertical() throws Exception
	{
		return(VerticalAxis.getVoltageRatio());
	}
}
