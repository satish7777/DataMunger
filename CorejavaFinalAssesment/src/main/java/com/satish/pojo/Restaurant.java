package com.satish.pojo;

import java.time.LocalDateTime;

public class Restaurant {
	
	//RestaurantId,RestaaurantName,Ratings, OpeningTime,ClosingTime,reviews,Dishes
	
	private int RestaurantId;
	private String RestaaurantName;
	private float Ratings;
	private LocalDateTime OpeningTime;
	private LocalDateTime ClosingTime;
	private Review  reviews;
	private Dishes dishes;
	public int getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		RestaurantId = restaurantId;
	}
	public String getRestaaurantName() {
		return RestaaurantName;
	}
	public void setRestaaurantName(String restaaurantName) {
		RestaaurantName = restaaurantName;
	}
	public float getRatings() {
		return Ratings;
	}
	public void setRatings(float ratings) {
		Ratings = ratings;
	}
	public LocalDateTime getOpeningTime() {
		return OpeningTime;
	}
	public void setOpeningTime(LocalDateTime openingTime) {
		OpeningTime = openingTime;
	}
	public LocalDateTime getClosingTime() {
		return ClosingTime;
	}
	public void setClosingTime(LocalDateTime closingTime) {
		ClosingTime = closingTime;
	}
	public Review getReviews() {
		return reviews;
	}
	public void setReviews(Review reviews) {
		this.reviews = reviews;
	}
	public Dishes getDishes() {
		return dishes;
	}
	public void setDishes(Dishes dishes) {
		this.dishes = dishes;
	}
	public Restaurant(int restaurantId, String restaaurantName, float ratings, LocalDateTime openingTime,
			LocalDateTime closingTime, Review reviews, Dishes dishes) {
		super();
		RestaurantId = restaurantId;
		RestaaurantName = restaaurantName;
		Ratings = ratings;
		OpeningTime = openingTime;
		ClosingTime = closingTime;
		this.reviews = reviews;
		this.dishes = dishes;
	}
	

}
