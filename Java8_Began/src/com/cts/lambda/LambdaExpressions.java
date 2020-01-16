package com.cts.lambda;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class LambdaExpressions {
	static List<String> countries;
	static Map<String, String> CountryCapitals;

	static {
		countries = new LinkedList<String>(Arrays.asList("India", "Australia", "Bangladesh", "Nepal", "USA"));
		CountryCapitals = new HashMap<String, String>();
		CountryCapitals.put("India", "New Delhi");
		CountryCapitals.put("Australia", "Melboune");
		CountryCapitals.put("Bangladesh", "Dhaka");
		CountryCapitals.put("Nepal", "Khatmandu");
		CountryCapitals.put("USA", "New York");

	}

	static void displayCountries() {

		System.out.println("****displayCountries*****");
		countries.forEach((s) -> System.out.println(s));

	}

	static void displayCountryCapitals() {

		System.out.println("****displayCountryCapitals*****");
		CountryCapitals.forEach((country, capital) -> System.out.println(country + " capital is  " + capital));
	}

	static void SortCountryNames(List<String> countries) {
		System.out.println("****SortCountryNames*****");
		Collections.sort(countries, (c1, c2) -> ((String) c1).compareTo((String) c2));
		System.out.println("Sorted Collections list is" + countries);
	}

	static void SortCountriesByLength(List<String> countries) {
		System.out.println("****SortCountriesByLength in decending order*****");

		Comparator<String> C = (c1, c2) -> (c1.length() < c2.length() ? 1 : (c1.length() > c2.length() ? -1 : 0));
		Collections.sort(countries, C);
		System.out.println(countries);
	}

	static void removeCountries(String country) {

		System.out.println("****removeCountries*****");

		Predicate<String> p = (c) -> c.length() > 6;

		if (countries.contains(country) && p.test(country)) {
			countries.remove(country);
		}
		System.out.println(countries);
	}

	public static void main(String[] args) {
		displayCountries();
		displayCountryCapitals();
		SortCountryNames(countries);
		SortCountriesByLength(countries);
		removeCountries("Australia");
	}

}
