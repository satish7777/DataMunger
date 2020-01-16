package com.satish.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.satish.pojo.Dishes;
import com.satish.pojo.Restaurant;
import com.satish.pojo.Review;

public class Fileinitilaization {

	List<Review> reviewList=new ArrayList<Review>();
	List<Dishes> dishesList=new ArrayList<Dishes>();
	List<Restaurant> restaurentList=new ArrayList<Restaurant>();
	public void getData() {

		
		try(Stream reviewStream=Files.lines(Paths.get("repository", "review.csv"))){
			List<Review> reviewList=(List<Review>) reviewStream.collect(Collectors.toCollection(ArrayList::new));
			reviewList.forEach(System.out::println);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
