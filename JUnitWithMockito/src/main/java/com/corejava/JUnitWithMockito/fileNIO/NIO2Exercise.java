package com.corejava.JUnitWithMockito.fileNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NIO2Exercise {
	public static void main(String[] args) {
		 getFilesNames();
		 getExpiredTablets("medical.txt", "reddys");
		findAbsolutePath("medical.txt", "repo");
	}

	public static Map<String, String> getExpiredTablets(String filename, String manufacturer) {
		System.out.println(
				"This method should return a Map with key as Tablet name and value as expiry date of tablets for those tablets, \n"
						+ "which are already expired and  are from a given manufacturer.");
		Map<String, String> map = null;
		try (Stream<String> fileData = Files.lines(Paths.get("src/repo", "medical.txt"))) {
			List<Tablet> list = fileData.map(NIO2Exercise::readData).collect(Collectors.toCollection(ArrayList::new));

			map = list.stream().filter(t -> t.getManufacturer().equals(manufacturer))
					.collect(Collectors.toMap(Tablet::getTabletName, t -> t.getManufactured_date()));
			// list.forEach(System.out::println);
			System.out.println(map);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return map;
	}

	public static Tablet readData(String data) {
		String row[] = data.split(",");
		Tablet tab = new Tablet(row[0], row[1], row[2], row[3]);
		return tab;
	}

	public static void getFilesNames() {
		System.out.println(
				"create a method to list all the files ending with .java in the current project's src folder and its subfolders");

		try (Stream<Path> paths = Files.walk(Paths.get("src"))) {

			paths.filter(f -> Files.isRegularFile(f)).filter(f -> f.toString().contains(".java"))

					.forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean findAbsolutePath(String fileName, String path) {
		System.out.println(
				"create a method which takes two String parameters. The first parameter is the filename to be searched and the second parameter is the	\n"
						+ "     absolute path of the directory to be searched.");
		System.out.println(path);
		try (Stream<Path> findFile = Files.walk(Paths.get(path))) {
			// findFile.filter(fileName1->Files.isRegularFile(fileName1))
			// .forEach(System.out::println);

			boolean b = findFile.map(f -> f.getFileName().toString())
					.anyMatch(fileName1 -> fileName1.equalsIgnoreCase(fileName));
			if (b) {
				System.out.println("File Found");
				return true;
			} else
				System.out.println("Not Found");
			return false;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
