
package Intro.GameShowControllerGUI.src.MainPackage;
//Imports all required packages
import com.phidget22.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerLogic 
{
    //Variable Declaration
    static DigitalInput redButton; 
    static DigitalInput greenButton;
    static DigitalOutput redLED;
    static DigitalOutput greenLED;
    //Variable Declaration and Initialization
    static boolean greenState = true, redState = true;
    static int redScore = 0, greenScore = 0, trialNumber = 0;
        
        //Prints the scores and trial number to the console
        static void PrintScore(int green, int red)
        {
            System.out.println("\nTrial Number: "+trialNumber);
            System.out.println("--\t--\t--");
            System.out.println("Green Score: "+green);
            System.out.println("Red Score: "+red);
            System.out.println("--\t--\t--");
        }
        
        //Toggles LED's on depending on which was pressed first
        static void ToggleLED(boolean red, boolean green) throws PhidgetException
        {
            if(!red && !green)
            {
                redLED.setState(false);
                greenLED.setState(false);
            }
            else if(red && !green)
            {
                redLED.setState(true);
                trialNumber++;
                GameShowGUI.changeColour(false);
                try 
                {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(ControllerLogic.class.getName()).log(Level.SEVERE, null, ex);
                }
                redLED.setState(false);
                greenLED.setState(false);
            }
            else if(!red && green)
            {
                redLED.setState(false);
                greenLED.setState(true);
                trialNumber++;
                GameShowGUI.changeColour(true);
                try 
                {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(ControllerLogic.class.getName()).log(Level.SEVERE, null, ex);
                }
                greenLED.setState(false);
            }
            else if(red && green)
            {
                //Does nothing, both as a tie and if one is pressed to retrigger
                //the listener after one is already pressed
            }
        }
        
        //Attach listener for the phidget devices
        private static AttachListener onAttachListener = new AttachListener()
        {
            @Override
            public void onAttach(AttachEvent ae) 
            {
                Phidget ch = ae.getSource();
                try
                {
                    if(ch.getHubPort() == redButton.getHubPort())
                    {
                        System.out.println("Red Button Attached");
                    }
                    else if(ch.getHubPort() == greenButton.getHubPort())
                    {
                        System.out.println("Green Button Attached");
                    }
                    else if(ch.getHubPort() == redLED.getHubPort())
                    {
                        System.out.println("Red LED Attached");
                    }
                    else if(ch.getHubPort() == greenLED.getHubPort())
                    {
                        System.out.println("Green LED Attached");
                    }
                }
                catch(PhidgetException ex)
                    {
                        System.out.println(ex.getDescription());
                    }
            }
        };
        
        //Detach listener for the phidget devices
         private static DetachListener onDetachListener = new DetachListener() 
        {
            @Override
            public void onDetach(DetachEvent de) 
            {
                Phidget ch = de.getSource();
                try
                {
                    if(ch.getHubPort() == redButton.getHubPort())
                    {
                        //System.out.println("Red Button Dettached");
                    }
                    else if(ch.getHubPort() == greenButton.getHubPort())
                    {
                        //System.out.println("Green Button Dettached");
                    }
                    else if(ch.getHubPort() == redLED.getHubPort())
                    {
                        //System.out.println("Red LED Dettached");
                    }
                    else if(ch.getHubPort() == greenLED.getHubPort())
                    {
                        //System.out.println("Green LED Dettached");
                    }
                }
                catch(PhidgetException ex)
                    {
                        System.out.println(ex.getDescription());
                    }
            }
        };
        
         //Error listener for the phidget devices
         private static ErrorListener onErrorListener = new ErrorListener() 
        {
            @Override
            public void onError(ErrorEvent ee) 
            {
                Phidget ch = ee.getSource();
                try
                {
                    if(ch.getHubPort() == redButton.getHubPort())
                    {
                        //System.out.println("Red Button Error");
                    }
                    else if(ch.getHubPort() == greenButton.getHubPort())
                    {
                        //System.out.println("Green Button Error");
                    }
                    else if(ch.getHubPort() == redLED.getHubPort())
                    {
                        //System.out.println("Red LED Error");
                    }
                    else if(ch.getHubPort() == greenLED.getHubPort())
                    {
                        //System.out.println("Green LED Error");
                    }
                }
                catch(PhidgetException ex)
                    {
                        System.out.println(ex.getDescription());
                    }
            }    
        };
         
    //State change listener for the phidget devices     
    private static DigitalInputStateChangeListener onStateChange = new DigitalInputStateChangeListener() 
    {
        @Override
        public void onStateChange(DigitalInputStateChangeEvent disce) 
            {
                Phidget ch = disce.getSource();
                
                try
                {
                    if(ch.getHubPort() == redButton.getHubPort())
                    {
                        if(redState)
                        {
                            redState = false;
                            System.out.println("Red Button Released");
                        }
                        else if(!redState)
                        {
                           redState = true;
                           ToggleLED(redState, greenState);
                           System.out.println("Red Button Pressed");
                        }
                    }
                    else if(ch.getHubPort() == greenButton.getHubPort())
                    { 
                        if(greenState)
                        {
                            greenState = false;
                            System.out.println("Green Button Released");
                        }
                        else if(!greenState)
                        {
                           greenState = true;
                           ToggleLED(redState, greenState);
                           System.out.println("Green Button Pressed");
                        }
                    }
                }
                catch(PhidgetException ex)
                    {
                        System.out.println(ex.getDescription());
                    }
            }
    };
    
    //Initializes and activates all the phidget devices
    public static void ControllerInitialization() throws PhidgetException
    {
        /*Declaration\=
        Green Button = Hub port 0
        Red Button = Hub Port 1
        Green LED = Hib Port 5
        Red LED = Hub Port 4
        */
        redButton = new DigitalInput();
        greenButton = new DigitalInput();
        redLED = new DigitalOutput();
        greenLED = new DigitalOutput();
        
        redButton.setIsHubPortDevice(true);
        redLED.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.addAttachListener(onAttachListener);
        redLED.addDetachListener(onDetachListener);
        redLED.addErrorListener(onErrorListener);
        redButton.setHubPort(0);
        redButton.addAttachListener(onAttachListener);
        redButton.addDetachListener(onDetachListener);
        redButton.addErrorListener(onErrorListener);
        redButton.addStateChangeListener(onStateChange);
        greenButton.setIsHubPortDevice(true);
        greenLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.addAttachListener(onAttachListener);
        greenLED.addDetachListener(onDetachListener);
        greenLED.addErrorListener(onErrorListener);
        greenButton.setHubPort(5);
        greenButton.addAttachListener(onAttachListener);
        greenButton.addDetachListener(onDetachListener);
        greenButton.addErrorListener(onErrorListener);
        greenButton.addStateChangeListener(onStateChange);
        redButton.open();
        redLED.open();
        greenButton.open();
        greenLED.open();
    }
    
}
