package datetimeexamples;

import java.time.LocalTime;

public class LocalTimeExamples {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current time: " + time);
		
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nanosecond = time.getNano();
		
		System.out.println("Current hour: " + hour);
		System.out.println("Current minute: " + minute);
		System.out.println("Current second: " + second);
		System.out.println("Current nanosecond: " + nanosecond);
		
		LocalTime twoHoursAgo = time.minusHours(2);
		System.out.println("2 hours ago: " + twoHoursAgo);
		
		LocalTime thirtyMinutesLater = time.plusMinutes(30);
		System.out.println("30 minutes later: " + thirtyMinutesLater);
		
		System.out.println("Current time: " + time);
		
		time = time.plusHours(4);
		
		System.out.println("Current time: " + time);
		
		LocalTime appoinmentTime = LocalTime.of(15, 30, 0);
		System.out.println("Appoinment time: " + appoinmentTime);
		
		System.out.println("is appoinment time before current time ? " + appoinmentTime.isBefore(time));
		

	}

}

















