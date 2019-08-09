package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Movie;
import com.demo.persistence.MovieDAO;
import com.demo.service.MovieServiceInterface;

//@RestController
@Controller
public class MovieController {

	@Autowired
	MovieServiceInterface movieService;

	@Autowired
	MovieDAO movieDAO;

	@RequestMapping(value="/movie")
	public String getMovies(Model model) {
		model.addAttribute("movie",new Movie());
		return "movie";
	}
	
	
	
	
	@RequestMapping("/getMovie")
	public List<Movie> getMovies() {
		return movieService.getAllMovies();
	}

	@RequestMapping("/saveMovie")
	public String saveProduct() {
		Movie movie = new Movie(1425, "Dunkirk", "Christopher Nolan", 5);
		Movie movie2 = new Movie(1445, "John Wick", "Chad Stahelski", 31);
		Movie movie3 = new Movie(1835, "The Dark Knight Rises", "Christopher Nolan", 29);
		Movie movie4 = new Movie(1857, "Back to the Future", "Steven Spielberg ", 3);
		Movie movie5 = new Movie(1413, "Avengers", "Russo Brothers", 200);
		Movie movie6 = new Movie(5425, "Sherlock Holmes", "Dexter Fletcher", 16);

		movieService.addMovie(movie);
		movieService.addMovie(movie2);
		movieService.addMovie(movie3);
		movieService.addMovie(movie4);
		movieService.addMovie(movie5);
		movieService.addMovie(movie6);

		return "Movie Saved successfully";

	}

	@RequestMapping("/deleteMovie/{mId}")
	public String deleteMovie(@PathVariable("mId")Integer movieId) {
		movieService.deleteMovie(movieId);
		return "Movie Deleted";
	}

	@RequestMapping("getMovieByName/{movieName}")
	public List<Movie> getAllMovie(@PathVariable("movieName")String movieName){
		return movieService.getMovieByName(movieName);

	}

	@RequestMapping("getMoviesBetween/{value1}/{value2}")
	public List<Movie> getMoviesBetween(@PathVariable("value1")Integer value1, @PathVariable("value2")Integer value2){
		return movieService.getMovieByBudget(value1, value2);
	}


}

