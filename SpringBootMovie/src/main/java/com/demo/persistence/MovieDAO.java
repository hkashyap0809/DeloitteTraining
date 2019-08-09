package com.demo.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.model.Movie;

@Repository
public interface MovieDAO extends CrudRepository<Movie, Integer>{
	
	public List<Movie> findByMovieName(String name);
	public List<Movie> findByBudgetBetween(int value1, int value2);
	
	
	//findByMovieIdAndMovieName(int movieId, String movieName);
	//findDistinctByMovieId(String movieId);

}
