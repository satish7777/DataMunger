package com.satish.pojo;

public class Review {
	//RestaurantId,reviews
	
	private int RestaurantId;
	private String reviews;
	public int getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		RestaurantId = restaurantId;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public Review() {
		super();
	}
	public Review(int restaurantId, String reviews) {
		super();
		RestaurantId = restaurantId;
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "Review [RestaurantId=" + RestaurantId + ", reviews=" + reviews + "]";
	}
	

}
