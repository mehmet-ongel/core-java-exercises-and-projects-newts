package datetimeexamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClassExample {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		Date date = calendar.getTime();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
		String formattedDateTime = simpleDateFormat.format(date);
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yy hh.mm");
		String formattedDateTime2 = simpleDateFormat2.format(date);
		
		
		System.out.println("Current year: " + year);
		System.out.println("Current month: " + month);
		System.out.println("Week of year: " + weekOfYear);
		System.out.println("Week of month: " + weekOfMonth);
		System.out.println("Day of year: " + dayOfYear);
		System.out.println("Day of month: " + dayOfMonth);
		System.out.println("Day of week: " + dayOfWeek);
		System.out.println("Hour: " + hour);
		System.out.println("Hour of day: " + hourOfDay);
		System.out.println("Minute: " + minute);
		System.out.println("Second: " + second);
		System.out.println("Millisecond: " + millisecond);
		System.out.println("Current Date and Time: " + date);
		System.out.println("Formatted Date Time: " + formattedDateTime);
		System.out.println("Formatted Date Time 2: " + formattedDateTime2);
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(1990, Calendar.FEBRUARY, 20);
		System.out.println("My birthday: " + birthday.getTime());
		System.out.println("Year ? " + birthday.get(Calendar.YEAR));
		
		birthday.add(Calendar.YEAR, 10);
		System.out.println("10 years later: " + birthday.getTime());

	}

}











