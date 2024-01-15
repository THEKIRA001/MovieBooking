package com.example.MovieTicket.MovieBooking.Model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	String id;
	String movieName;
	String movieDirector;
	long movieRating;
	String movieLanguage;
	List<String> writer;
	List<String> actors;
	List<String> genre;
	
	
	
	public Movie(String id, String movieName, String movieDirector, long movieRating, String movieLanguage,
			List<String> writer, List<String> actors, List<String> genre) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieRating = movieRating;
		this.movieLanguage = movieLanguage;
		this.writer = writer;
		this.actors = actors;
		this.genre = genre;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public long getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(long movieRating) {
		this.movieRating = movieRating;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public List<String> getWriter() {
		return writer;
	}
	public void setWriter(List<String> writer) {
		this.writer = writer;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	public List<String> getGenre() {
		return genre;
	}
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieDirector=" + movieDirector + ", movieRating="
				+ movieRating + ", movieLanguage=" + movieLanguage + ", writer=" + writer + ", actors=" + actors
				+ ", genre=" + genre + "]";
	}
	
	
}
