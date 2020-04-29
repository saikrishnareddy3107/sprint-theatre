package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Movie_Theaters")
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int movieTheatersId;
	private String TheaterName;
	private String movieName;
	
	private String movieDirector;
	private String movieLength;
	private String language;

	public int getMovieTheatersId() {
		return movieTheatersId;
	}

	public void setMovieTheatersId(int movieTheatersId) {
		this.movieTheatersId = movieTheatersId;
	}

	public String getTheaterName() {
		return TheaterName;
	}

	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(String movieLength) {
		this.movieLength = movieLength;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String city;



}
