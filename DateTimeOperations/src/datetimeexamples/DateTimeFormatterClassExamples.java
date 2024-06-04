package datetimeexamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterClassExamples {

	public static void main(String[] args) {
		
		//String pattern
		LocalDate myCustomDate = LocalDate.of(2030, 6, 7);
		LocalTime myCustomTime = LocalTime.of(11, 20, 30);
		LocalDateTime myCustomDateTime = LocalDateTime.of(myCustomDate, myCustomTime);
		
		System.out.println("Default custom date-time: " + myCustomDateTime);
		
		DateTimeFormatter myCustomFormatter = DateTimeFormatter.ofPattern("MMMM/dd, yyyy hh:mm:ss");
		
		System.out.println("Custom date time: " + myCustomFormatter.format(myCustomDateTime));
		
		//ISO constants
		DateTimeFormatter constantFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println("ISO date-time: " + constantFormatter.format(myCustomDateTime));
		
		//Localized Format Styles
		DateTimeFormatter localizedFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("Localized Style MEDIUM: " + localizedFormatter.format(myCustomDateTime));

	}

}
