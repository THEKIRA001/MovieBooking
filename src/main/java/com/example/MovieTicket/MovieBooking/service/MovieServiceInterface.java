package com.example.MovieTicket.MovieBooking.service;

import java.util.List;

import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface MovieServiceInterface {
	
	public Movie getMovieById(String id);
	
	public List<Movie> getAllMovies();
	
	public void addMovie(Movie movie);
	
	public void updateMovie(Movie movie);
	
	public void deleteMovieById(String id);
}
