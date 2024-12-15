
package main.java;


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private int ampm;    
    private String display;
    
    public ClockDisplay12Hour() {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        ampm = 1;
        updateDisplay();
    }
    
    public ClockDisplay12Hour(int hour, int minute) {
        
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        ampm = 1;
        setTime(hour, minute);  
        updateDisplay();
    }
    
    public void timeTick() {
        minutes.increment();
        if(minutes.getValue() == 0) {
            hours.increment();
            if(hours.getValue() == 0) {
                ampm++;
            }
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    
    public String getTime() {
        return display;
    }
    public void updateDisplay() {
        if (ampm % 2 == 0) {
            display = hours.getDisplayValue() + ":" +  minutes.getDisplayValue() + "PM";
        } else if (ampm % 2 != 0) {
            display = hours.getDisplayValue() + ":" +  minutes.getDisplayValue() + "AM";
        }
    }
}

