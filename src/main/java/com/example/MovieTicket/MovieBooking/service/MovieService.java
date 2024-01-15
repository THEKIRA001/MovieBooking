package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.example.MovieTicket.MovieBooking.Exceptions.IdAlreadyExistException;
import com.example.MovieTicket.MovieBooking.Exceptions.IdNotFoundException;
import com.example.MovieTicket.MovieBooking.Model.Movie;


public class MovieService implements MovieServiceInterface {

	public List<Movie> list = new ArrayList<>();
	public Map<String,Movie> movieMap = new HashMap<>();
	
	@Override
	public Movie getMovieById(String id) {
		if (ObjectUtils.isEmpty(movieMap.get(id))){
			throw new IdNotFoundException("No ticket found with id : "+id);
		}
		return movieMap.get(id);
	}

	@Override
	public List<Movie> getAllMovies() {
		return list;
	}

	@Override
	public void addMovie(Movie movie) {
		if (!ObjectUtils.isEmpty(movieMap.get(movie.getId())))
			throw new IdAlreadyExistException("Movie with id : "+movie.getId()+" already exists");
		list.add(movie);
		movieMap.put(movie.getId(), movie);
	}

	@Override
	public void updateMovie(Movie movie) {
		list.remove(getMovieById(movie.getId()));
		movieMap.remove(movie.getId());
		
		list.add(movie);
		movieMap.put(movie.getId(), movie);
	}

	@Override
	public void deleteMovieById(String id) {
		list.remove(getMovieById(id));
		movieMap.remove(id);
	}

}
