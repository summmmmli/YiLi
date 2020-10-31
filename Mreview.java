package assignment6;

import java.util.*;

public class Mreview implements Comparable<Mreview>
{
	// instance variables
	private String title;   // title of the movie
	private ArrayList<Integer> ratings; // list of ratings stored in a Store object
	
	// Constructors
	public Mreview() {
		// TODO Auto-generated constructor stub
	}
	
	public Mreview(String title) {
		this.title = title; 
	}
	
	public Mreview(String title, int firstRating) {
		this.title = title;
		ratings = new ArrayList<>();
		ratings.add(firstRating);
	}
	
	// Methods
	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		int totalrating = 0;
		for (int i = 0; i < ratings.size(); i++) {
			totalrating += ratings.get(i);
		}
		return totalrating/ratings.size();
	}
	
	@Override
	public int compareTo(Mreview obj) {
		if (aveRating() > obj.aveRating()) {
			return 1;
		}
		return -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { 
			return true;
		}
		if (!(obj instanceof Mreview)) {
	          return false;
	    }
		
		Mreview movie = (Mreview) obj;
		if (aveRating() == movie.aveRating()) {
			return true;
		}
		return false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int numRatings() {
		return ratings.size(); // Returns the size of the rating list
	}
	
	public String toString() {
		String ratingoutput = "";
		for (int i = 0; i < ratings.size(); i++) {
			ratingoutput += ratings.get(i) + " ";
		}
		return "Title: " + title + "\nList of Ratings: " + ratingoutput;
	}
	
	
	public static void main(String[] arg) {
		Mreview movie = new Mreview("Kill Bill", 3);
		movie.addRating(4);
		movie.addRating(3);
		System.out.println(movie.toString());
		System.out.println("Average rating: " + movie.aveRating());
	}
}