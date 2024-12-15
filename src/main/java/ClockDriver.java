package main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay clockDisplay = new ClockDisplay();
        clockDisplay.setTime(00,00);
        System.out.println("Read Time " + clockDisplay.getTime());
        clockDisplay.timeTick();
        System.out.println("Read Time " + clockDisplay.getTime()); 
        
        ClockDisplay clockDisplay1 = new ClockDisplay(03,32);  
        clockDisplay1.setTime(03,32);
        System.out.println("Read Time " + clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println("After Tick Read Time " + clockDisplay1.getTime());
        
        clockDisplay1.setTime(03,9);
        System.out.println("Read Time " + clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println("After Tick Read Time " + clockDisplay1.getTime());
        
        clockDisplay1.setTime(01,59);
        System.out.println("Read Time " + clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println("After Tick Read Time " + clockDisplay1.getTime());
        
        clockDisplay1.setTime(9,59);
        System.out.println("Read Time " + clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println("After Tick Read Time " + clockDisplay1.getTime());
        
        clockDisplay1.setTime(23,59);
        System.out.println("Read Time " + clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println("After Tick Read Time " + clockDisplay1.getTime());
        
        ClockDisplaySeconds clockDisplaySeconds = new ClockDisplaySeconds();
        clockDisplaySeconds.setTime(00,00,00);
        System.out.println("Read Time " + clockDisplaySeconds.getTime());
        clockDisplaySeconds.timeTick();
        System.out.println("Read Time " + clockDisplaySeconds.getTime()); 
           
        clockDisplaySeconds.setTime(3,32,59);
        System.out.println("Read Time " + clockDisplaySeconds.getTime());
        clockDisplaySeconds.timeTick();
        System.out.println("Read Time " + clockDisplaySeconds.getTime()); 
        clockDisplaySeconds.setTime(1,00,59);
        System.out.println("Read Time " + clockDisplaySeconds.getTime());
        clockDisplaySeconds.timeTick();
        System.out.println("Read Time " + clockDisplaySeconds.getTime()); 
        clockDisplaySeconds.setTime(1,59,59);
        System.out.println("Read Time " + clockDisplaySeconds.getTime());
        clockDisplaySeconds.timeTick();
        System.out.println("Read Time " + clockDisplaySeconds.getTime()); 
        clockDisplaySeconds.setTime(23,59,59);
        System.out.println("Read Time " + clockDisplaySeconds.getTime());
        clockDisplaySeconds.timeTick();
        System.out.println("Read Time " + clockDisplaySeconds.getTime()); 
        
        ClockDisplay12Hour clockDisplay12Hour = new ClockDisplay12Hour();
        clockDisplay12Hour.setTime(00,00);
        System.out.println("Read Time " + clockDisplay12Hour.getTime());
        clockDisplay12Hour.timeTick();
        System.out.println("Read Time " + clockDisplay12Hour.getTime()); 
        
        clockDisplay12Hour.setTime(3,32);
        System.out.println("Read Time " + clockDisplay12Hour.getTime());
        clockDisplay12Hour.timeTick();
        System.out.println("Read Time " + clockDisplay12Hour.getTime()); 
        
        clockDisplay12Hour.setTime(11,59);
        System.out.println("Read Time " + clockDisplay12Hour.getTime());
        clockDisplay12Hour.timeTick();
        System.out.println("Read Time " + clockDisplay12Hour.getTime()); 
        
        clockDisplay12Hour.setTime(11,59);
        System.out.println("Read Time " + clockDisplay12Hour.getTime());
        clockDisplay12Hour.timeTick();
        System.out.println("Read Time " + clockDisplay12Hour.getTime());  
        
        clockDisplay12Hour.setTime(12,59);
        System.out.println("Read Time " + clockDisplay12Hour.getTime());
        clockDisplay12Hour.timeTick();
        System.out.println("Read Time " + clockDisplay12Hour.getTime());  
        
    }
}
