package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.Entity.Movies;
import com.capg.omts.Service.IMovieTheatreService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MovieTheatreRestController {

	@Autowired
	IMovieTheatreService service;

	@GetMapping("/run")
	public String run() {
		System.out.println("run is working");
		return "Run is working";
	}

	@GetMapping("/movie/search/{movieId}")
	public String searchMovie(@PathVariable int movieId) throws Exception {
		Movies movies = service.searchMovie(movieId);
		if (movies == null)
			throw new Exception("Invalid id");
		return "Your requested for the movie " + movies.getMovieName();
	}



	@GetMapping("/movies/getall")
	public List<Movies> getAllMovies() {
		List<Movies> movie = service.getAllMovies();
		return movie;
	}



}
