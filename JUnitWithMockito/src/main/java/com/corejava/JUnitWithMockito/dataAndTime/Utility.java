package com.corejava.JUnitWithMockito.dataAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/*
 * 
- Create a class Utility with the below static method
	- getBusSchedule(String start, Duration frequency) : List<String>
		- Method should return a List of String containing the bus timings for a day given the start time and duration as parameters.
		- The timing in the list should be in 24 hour format hh:mm
 */

public class Utility {
	public static void main(String[] args) {

		getBusSchedule("10:00", Duration.of(15, ChronoUnit.MINUTES));

	}

	public static void getBusSchedule(String start, Duration frequency) {

		List<String> out = new ArrayList<String>();
		String split[] = start.split(":");
		int Hours = Integer.parseInt(split[0].trim());
		int Minutes = Integer.parseInt(split[1].trim());
		LocalTime localTime = LocalTime.of(Hours, Minutes);
		
		LocalDateTime local=LocalDateTime.of(LocalDate.now(), localTime);
		
		while (!localTime.equals(LocalTime.MIDNIGHT)) {
		//while(localTime.isBefore(localTime.MIDNIGHT.plusHours(24))) {
			// System.out.println(localTime.toString());
			out.add(localTime.toString());
			System.out.println(localTime.plus(frequency));
			localTime = localTime.plus(frequency);

		}
		System.out.println(out);

	}

}
