package datetimeexamples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class LocalDateExamples {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current date: " + date);
		
		int year = date.getYear();
		int monthValue = date.getMonthValue();
		Month monthName = date.getMonth();
		int dayOfYear = date.getDayOfYear();
		int dayOfMonth = date.getDayOfMonth();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int valueOfDayOfWeek = dayOfWeek.getValue();
		
		System.out.println("Current year: " + year);
		System.out.println("Current month value: " + monthValue);
		System.out.println("Current month name: " + monthName);
		System.out.println("Day of year: " + dayOfYear);
		System.out.println("Day of month: " + dayOfMonth);
		System.out.println("Day of week: " + dayOfWeek);
		System.out.println("ValueOfDayOfWeek: " + valueOfDayOfWeek);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("Day of week in Calendar: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		LocalDate twoWeeksAgo = date.minusWeeks(2);
		System.out.println("2 weeks ago: " + twoWeeksAgo);
		
		LocalDate fiveDayslater = date.plusDays(5);
		System.out.println("5 days later: " + fiveDayslater);
		
		System.out.println("Current date: " + date);
		
		date = date.plusDays(10);
		
		System.out.println("Current date: " + date);
		
		LocalDate weddingDate = LocalDate.of(2014, Month.JULY, 15);
		System.out.println("Wedding date: " + weddingDate);
		
		System.out.println("is wedding date before current date ? " + weddingDate.isBefore(date));

	}

}

















