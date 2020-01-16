package com.cts.streamss;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.PlainDocument;

public class StreamOperationsExercise {

	public static List<Player> playersList = Arrays
			.asList(new Player[] { new Player("Sehwag", 225, 8500, 319, new Country(1, "India")),
					new Player("Sachin", 425, 11500, 222, new Country(1, "India")),
					new Player("Lee", 225, 500, 319, new Country(2, "Australia")),
					new Player("Shakib", 115, 1100, 100, new Country(3, "Bangladesh")),
					new Player("Kallis", 555, 9500, 126, new Country(4, "South Africa")),
					new Player("Devillers", 234, 1700, 66, new Country(4, "South Africa"))

	});

	public static void displayPlayers() {

		// playersList.stream().forEach(System.out::println);

		System.out.println("****************displayPlayers*************************");
		playersList.stream().map(Player::getPlayerName).forEach(System.out::println);
	}

	public static void displayPlayersForCountry(String country) {
		System.out.println("****************displayPlayersForCountry*************************");
		// playersList.stream().filter(p -> p.getHighestScore() >
		// 100).forEach(System.out::println);
		// playersList.stream().filter(p -> p.getHighestScore() > 100).filter(p ->
		// p.getCountry().getCountryName().equals("India")).forEach(System.out::println);
		playersList.stream().filter(p -> p.getCountry().getCountryName().equals(country))
				.filter(p -> p.getHighestScore() > 100).sorted().forEach(System.out::println);
	}

	public static List<String> getPlayerNames() {
		//
		System.out.println("****************getPlayerNames*************************");
		List<String> playernames = playersList.stream().filter(p -> p.getRuns() > 5000).map(p -> p.getPlayerName())
				.sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedList::new));
		return playernames;
	}

	public static Double getAverageRunsByCountry(String country) {
		System.out.println("****************getAverageRunsByCountry*************************");
		// playersList.stream().filter(c->c.getCountry().getCountryName().equals(country)).forEach(System.out::println);
		// playersList.stream().filter(c->c.getCountry().getCountryName().equals(country)).map(p->p.getRuns()).forEach(System.out::println);
		Double average = playersList.stream().filter(c -> c.getCountry().getCountryName().equals(country))
				.mapToDouble((Player::getRuns)).average().getAsDouble();
		// System.out.println(count);
		return average;
	}

	/*
	 * - getPlayerNamesSorted Return a list with names of Players sorted as per
	 * country and then by matchesPlayed(descending)
	 * 
	 * - getPlayerCountry return a map with the PlayerName and CountryName of all
	 * players who have played more than 200 matches *
	 * 
	 * 
	 */
	public static void getPlayerNamesSorted() {
		System.out.println("****************getPlayerNamesSorted*************************");
		//playersList.stream().map(p->p.getCountry().getCountryName()).sorted().forEach(System.out::println);
		//playersList.stream().map(p->p.getCountry().getCountryName()).sorted(Comparator.comparing((p)->p.getCountry().getCountryName())).forEach(System.out::println);

	}

	public static List<Player> findPlayer(String name, String country) {
		System.out.println("****************findPlayer*************************");
		List<Player> player = playersList.stream().filter(p -> p.getCountry().getCountryName().equals(country))
				.filter(p -> p.getPlayerName().equals(name)).collect(Collectors.toList());
		System.out.println(player);
		return player;
	}

	//static Player p = new Player();

	public static Map<String,String> getPlayerCountry() {
		System.out.println("****************getPlayerCountry*************************");
		Map<String,String> mapData = playersList.stream().filter(p -> p.getMatchesPlayed() > 200)
				.collect(Collectors.toMap(Player::getPlayerName,(p)->p.getCountry().getCountryName()));	
		System.out.println(mapData);
		return mapData;
//		Map<Integer,String> mapData = DataSource.studentList.stream()
//		.collect(Collectors.toMap(Student::getStudentId, Student::getStudentName));
	}

	public static void main(String[] args) {

		// displayPlayers();
		// displayPlayersForCountry("India");
		// displayPlayersForCountry("South Africa");
		// List<String> players =getPlayerNames();
		// System.out.println(players);
		// Double average=getAverageRunsByCountry("India");
		// System.out.println(average);
		// getPlayerNamesSorted(); //unable to get this using sorting please help me out with this
		//List<Player> player = findPlayer("Sachin", "India");
		//List<Player> player1 = findPlayer("Sehwag", "India");
		getPlayerCountry();
		

	}

}
