import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DigitalWatchSetReminderTest{
    @Test
    public void stub(){
        DigitalWatchSetReminder d1= new DigitalWatchSetReminder();
        String f = d1.setAdjustedTime("Current Date "+ 23 + ":" + 5 +":"+ 2022);
        assertEquals("Reminder is : "+ "Take care of x" +" At " + f,d1.adjustment(7,"Take care of x"));
        assertEquals("Reminder is : "+ "Make sure of y" +" At " + "undetermined date",d1.adjustment(65,"Make sure of y"));
    }

}