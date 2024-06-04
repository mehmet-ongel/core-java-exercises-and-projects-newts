package datetimeexamples;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExamples {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current Date time: " + dateTime);
		
		int year = dateTime.getYear();
		int hour = dateTime.getHour();
		
		System.out.println("Current year: " + year);
		System.out.println("Current hour: " + hour);
		
		LocalDateTime twoDaysAgo = dateTime.minusDays(2);
		System.out.println("2 Days ago: " + twoDaysAgo);
		
		LocalDateTime threeHoursLater = dateTime.plusHours(3);
		System.out.println("3 hours later: " + threeHoursLater);
		
		System.out.println("Current Date time: " + dateTime);
		
		dateTime = dateTime.minusHours(1);
		
		System.out.println("Current Date time: " + dateTime);
		
		LocalDateTime myBirthday = LocalDateTime.of(1990, 2, 20, 9, 30);
		System.out.println("My birthday: " + myBirthday);
		
		System.out.println("is my birthday before current date time ? " + myBirthday.isBefore(dateTime));

	}

}




















