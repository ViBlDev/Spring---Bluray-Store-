package com.mycompany.bluraystore.controller;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface service;


    @RequestMapping("/bluraystore-home")
    public @ModelAttribute("movies") List<Movie> displayHome() {
        System.out.println("Home displayed");
        List<Movie> listMovie = service.getMovieList();
        return listMovie;
    }

    public MovieServiceInterface getService() {
        return service;
    }

    public void setService(MovieServiceInterface service) {
        this.service = service;
    }
}

