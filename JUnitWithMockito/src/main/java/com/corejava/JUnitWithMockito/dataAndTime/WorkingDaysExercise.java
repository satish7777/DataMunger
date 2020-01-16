package com.corejava.JUnitWithMockito.dataAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/*
 * 	- getNextMonthsWorkingDays():List<String>
		- Method should return a List of String containing the working days for the next month given todays date.
		- Saturday and Sunday should be considered non working days
		- The date returned should be in format dd-mm-yyyy

 */

public class WorkingDaysExercise {

	// static TemporalAdjuster next_day = TemporalAdjusters.ofDateAdjuster(date -> {
	static TemporalAdjuster next_day = TemporalAdjusters.ofDateAdjuster(date -> {
		DayOfWeek dayofweek = date.getDayOfWeek();
		int daystoAdd;
		if (dayofweek == DayOfWeek.FRIDAY) {
			daystoAdd = 3;
		} else if (dayofweek == DayOfWeek.SATURDAY)
			daystoAdd = 2;
		else
			daystoAdd = 1;

		return date.plusDays(daystoAdd);
	});

	public static void main(String[] args) {
		System.out.println(getNextMonthsWorkingDays());
	}

	public static List<String> getNextMonthsWorkingDays() {
		LocalDate localDate = LocalDate.now();
		List<String> list = new ArrayList<String>();
		LocalDate Enddate=localDate.plusMonths(1);
		while (localDate.isBefore(Enddate)) {
			// list.add(localDate.now().format(""));
			String date = localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			list.add(date);
			// System.out.println(list);
			localDate = localDate.with(next_day);
			 System.out.println(localDate);
		}
		System.out.println(list);
		return list;
	}

}
