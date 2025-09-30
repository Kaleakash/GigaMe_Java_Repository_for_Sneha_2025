package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAPIExamples {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's Date: " + today);
		LocalTime time = LocalTime.now();
		System.out.println("Current Time: " + time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + dateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("Current Date and Time with Zone: " + zonedDateTime);
		System.out.println("to find the all zone details");
		ZoneId.getAvailableZoneIds().stream().filter(n->n.contains("GMT-7")).forEach(n->System.out.println(n));
		System.out.println("Specific Zone Date and Time: " + ZonedDateTime.now(ZoneId.of("SystemV/PST8PDT")));
		
		System.out.println(dateTime);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = dateTime.format(dtf);
		System.out.println("Formatted Date: " + formattedDate);
	}

}
