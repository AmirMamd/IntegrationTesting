import java.time.LocalTime;
public class DigitalWatchDate {
    public static String CurrentDate(int d){
        int day= 16;
        int month= 5;
        int year = 2022;
        if(d>15 && d<30){
            month++;
            day=d-15;
        }else if(d>30){
            return "undetermined date";
        }
        else{
            day+=d;
        }
        return "Current Date " + day +":" + month + ":" + year;
    }
}
