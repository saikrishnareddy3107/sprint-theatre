package com.example.demo.Service;

import java.util.List;

import com.capg.omts.Entity.Movies;


public interface IMovieTheatreService {
	

	
	public Movies searchMovie(int movieId);
	
	public List<Movies> getAllMovies();
	
}
