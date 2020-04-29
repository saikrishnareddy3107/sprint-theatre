package com.example.demo.dao;

import java.util.List;

import com.capg.omts.Entity.Movies;


public interface IMovieTheatreDao {
	
	
	public Movies searchMovie(int movieId);
	
	public List<Movies> getAllMovies();

}
