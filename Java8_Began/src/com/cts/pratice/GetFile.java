package com.cts.pratice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.DateFormatter;

public class GetFile {

	public static void main(String[] args) {

		try (Stream<String> file = Files.lines(Paths.get("repo", "Satish.csv"))) {

			List<MyPojo> pojo = file.map(GetFile::getdata).collect(Collectors.toList());
			System.out.println(pojo);
			date();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static MyPojo getdata(String s) {
		String[] row = s.split(",");
		// return new MyPojo(Integer.parseInt(row[0]),row[1],Integer.parseInt(row[2]));
		MyPojo pojo = new MyPojo(Integer.parseInt(row[0]), row[1], Integer.parseInt(row[2]));
		return pojo;
	}

	public static void date() {
		String date="2012-11-23";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dt=LocalDate.parse(date,df);
		System.out.println(dt.getYear());
		//LocalDate dadat=LocalDate.parse(date);
		//System.out.println(dadat);
		
	}

}

// (satish.csv)->{String []row=