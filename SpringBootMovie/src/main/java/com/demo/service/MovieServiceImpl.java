package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Movie;
import com.demo.persistence.MovieDAO;

@Service("productService")
public class MovieServiceImpl implements MovieServiceInterface {

	@Autowired(required=true)
	MovieDAO movieDAO;

	@Override
	@Transactional
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		movieDAO.save(movie);

	}

	@Override
	@Transactional
	public void updateProduct(Movie movie) {
		// TODO Auto-generated method stub
		movieDAO.save(movie);

	}

	@Override
	@Transactional
	public List<Movie> getAllMovies() {
		return (List<Movie>)movieDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<Movie> getMoiveById(int movieId) {
		return movieDAO.findById(movieId);
	}

	@Override
	@Transactional
	public void deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		movie.setMovieId(movieId);
		movieDAO.delete(movie);

	}

	@Override
	public List<Movie> getMovieByName(String movieName) {
		return movieDAO.findByMovieName(movieName);
	}

	@Override
	public List<Movie> getMovieByBudget(int value1, int value2) {
		return movieDAO.findByBudgetBetween(value1, value2);
	}

}
