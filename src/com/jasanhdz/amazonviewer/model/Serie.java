package com.jasanhdz.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;

	public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.setSessionQuantity(sessionQuantity);
		this.chapters = chapters;
	}
	
	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n:: Serie ::" +
				"\nTitle: " + getTitle() +
				"\nGenre: " + getGenre() +
				"\nYear: " + getYear() +
				"\nCreator: " + getCreator() +
				"\nDuration: " + getDuration();
	}
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for(int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie " +i, "Action", "Creator " +i, 1200+i, 1+i, Chapter.makeChaptersList()));
		}
		return series;
	}
}
