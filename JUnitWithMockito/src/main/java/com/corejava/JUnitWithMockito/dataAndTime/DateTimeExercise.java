package com.corejava.JUnitWithMockito.dataAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class DateTimeExercise {
	public static List<Tablet> tabletsList = Arrays.asList(
			new Tablet[] { new Tablet("Paracetmol", "Reddys", LocalDate.of(2013, 11, 14), LocalDate.of(2021, 06, 29)),
					new Tablet("Anacyin", "pharma", LocalDate.of(2009, 03, 24), LocalDate.of(2020, 07, 24)),
					new Tablet("Crocin", "Reddys", LocalDate.of(2012, 03, 24), LocalDate.of(2019, 12, 31)),
					new Tablet("IBrifin", "Reddys", LocalDate.of(2019, 03, 24), LocalDate.of(2019, 12, 31))

			});

	public static void main(String[] args) {
		getExpiringTables(30);
		getExpiringTabletsSorted();
		getTabletExpiryPeriod();
		getSameYearExpiry();
	}

	public static void getExpiringTables(int months) {
		System.out.println(
				"Method should take number of months as parameter and return a List of tablet names expiring within the given months from today.");

		List<Tablet> collect = tabletsList.stream()
				.filter(t -> t.getManufactureDate().isAfter(LocalDate.now().plusMonths(months)))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
		// tabletsList.stream().filter((Period.between(t->t.getExpiryDate(),
		// LocalDate.now())<months));
		// tabletsList.stream().filter(ChronoUnit.MONTHS(t->t.getExpiryDate()));
	}

	public static void getExpiringTabletsSorted() {
		System.out.println("return a  List of Tablets, in the ascending order of expiry date");

		List<Tablet> tab = tabletsList.stream().sorted(Comparator.comparing(Tablet::getManufactureDate))
				.collect(Collectors.toList());
		System.out.println(tab);
		// tabletsList.stream().sorted(Comparator.comparing(keyExtractor))
	}

	/*
	 * - getTabletExpiryPeriod - return a Map with the tablet name as key and the
	 * period between the manufacture date and expiry date as value. The period
	 * should be a string containing years, months and days (ex: 1 year/s 2 month/s
	 * 5 day/s , 3 month/s 5 day/s, 3 year/s ..)
	 */

	public static void getTabletExpiryPeriod() {

		System.out.println(
				"return a Map with the tablet name as key and the period between the manufacture date and expiry date as value");
		Map<String, Period> map = tabletsList.stream()
				.collect(Collectors.toMap(Tablet::getTabletName, t -> getPeriod(t)));
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}

	public static Period getPeriod(Tablet tablet) {
		Period p = Period.between(tablet.getManufactureDate(), tablet.getExpiryDate());
		return p;
	}

	/*
	 * - getSameYearExpiry - Return a Map with key as manufacturer and value as list
	 * of tablet names which are manufactured in the current year and are already
	 * expired Test the above methods
	 */
	public static void getSameYearExpiry() {
		System.out.println("Return a Map with key as manufacturer and value as list of tablet names which are manufactured in the current year and are already expired");
		
		//tabletsList.stream().filter((t->t.getManufactureDate().getYear()==LocalDate.now().getYear()) && t->t.) 
		Map<String,String> map =tabletsList.stream().filter(t->t.getManufactureDate().getYear()==LocalDate.now().getYear()).filter(t->t.getManufactureDate().isBefore(LocalDate.now()))
		.collect(Collectors.toMap(Tablet::getManufacturer, Tablet::getTabletName));
		
		System.out.println(map);
	}
}
