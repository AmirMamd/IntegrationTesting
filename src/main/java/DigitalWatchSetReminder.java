public class DigitalWatchSetReminder {
    public static String AdjustedTime;
    public static String adjustment(int day, String Reminder){
        AdjustedTime= DigitalWatchDate.CurrentDate(day);

        return "Reminder is : "+ Reminder +" At " +AdjustedTime;
    }

    public static String setAdjustedTime(String adjustedTime) {
        AdjustedTime = adjustedTime;
        return AdjustedTime;
    }
}
