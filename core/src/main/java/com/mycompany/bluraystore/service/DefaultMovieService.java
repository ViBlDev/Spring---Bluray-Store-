package com.mycompany.bluraystore.service;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    // private MovieRepository repository = new MovieRepository();
    // private MovieRepositoryWithText repository = new MovieRepositoryWithText();

    @Autowired
    private MovieRepositoryInterface repository;

    public void registerMovie(Movie movie) {
        // repository.createMovie(movie);
        repository.add(movie);
    }

    @Override
    public List<Movie> getMovieList() {
        return repository.list();
    }

    public void getMovieList(Movie movie){
        repository.add(movie);
    }

    public MovieRepositoryInterface getRepository() {
        return repository;
    }

    public void setRepository(MovieRepositoryInterface repository) {
        this.repository = repository;
    }
}
