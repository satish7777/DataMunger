package com.satish.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.satish.pojo.Review;

public class FileReader {

	public static void readReviewFile() {
		Fileinitilaization fi=new Fileinitilaization();
		fi.getData();
	}

	public static Review readReviewData(String data) {
		String row[] = data.split(",");
		Review review = new Review(Integer.parseInt(row[0]), row[1]);
		return review;
	}

	
}
