package advancesIqtools;

import java.sql.Date;
import java.util.Calendar;

public class Datetron {
	public static Calendar dateToCalendario(java.util.Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

}
