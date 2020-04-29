package com.example.demo.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.omts.Entity.Movies;


@Repository
@Transactional
public class MovieDaoImpl implements IMovieTheatreDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Movies searchMovie(int movieId) {
		Movies movies=entityManager.find(Movies.class, movieId);
		return movies;
		
	}


	@Override
	public List<Movies> getAllMovies() {
		TypedQuery<Movies> query=entityManager.createQuery("from Movies",Movies.class);
		return query.getResultList();
	}


}
