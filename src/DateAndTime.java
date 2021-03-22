import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateAndTime {
	public static final String DATE_FORMAT_NOW="EEE,d MM yyyy HH:mm:ss";
	
	//get the date and time now as a string
	public static String DateTime()
	{
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
		
	}

}
