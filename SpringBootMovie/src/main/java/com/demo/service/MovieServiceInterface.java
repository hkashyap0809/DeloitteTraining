package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Movie;


public interface MovieServiceInterface {

	public void addMovie(Movie movie);
	public void updateProduct(Movie movie);
	public List<Movie> getAllMovies();
	public Optional<Movie> getMoiveById(int movieId);
	public void deleteMovie(int movieId);
	public List<Movie> getMovieByName(String name);
	public List<Movie> getMovieByBudget(int value1, int value2);

}
