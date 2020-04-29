package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.Dao.IMovieTheatreDao;
import com.capg.omts.Entity.Movies;


@Service
public class MovieThratreServiceImpl implements IMovieTheatreService {
	@Autowired
	IMovieTheatreDao dao;
	

	@Override
	public Movies searchMovie(int movieId) {
		
		return dao.searchMovie(movieId);
	}


	@Override
	public List<Movies> getAllMovies() {
		
		return dao.getAllMovies();
	}

}
