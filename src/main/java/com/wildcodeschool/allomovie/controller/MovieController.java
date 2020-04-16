package com.wildcodeschool.allomovie.controller;

import com.wildcodeschool.allomovie.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;

// MAJ + CTRL + ALT + L

@Controller
public class MovieController {

    @GetMapping("/movie")
    public String showMovie(
            @RequestParam(
                    name = "idMovie",
                    required = false,
                    defaultValue = "0") int id, Model out) {

        out.addAttribute("movie", findOneMovie(id));

        return "movie";
    }

    @GetMapping("/movies")
    public String showMovies(Model out) {

        out.addAttribute("movies", findAllMovies());

        return "movies";
    }

    /**
     * Database simulation : load all movies
     * @return list of all movies
     */
    public ArrayList<Movie> findAllMovies() {

        ArrayList<Movie> movieList = new ArrayList<>();
        Movie bttf = new Movie(0, "Back to the Future",
                "img/poster-bttf.jpg", 8.5, new Date(),
                false);
        Movie alien = new Movie(1, "Alien",
                "img/poster-alien.jpg", 8.4, new Date(),
                true);
        Movie cineman = new Movie(2, "Cinéman",
                "img/poster-cineman.jpg", 3.0, new Date(),
                false);
        movieList.add(bttf);
        movieList.add(alien);
        movieList.add(cineman);

        return movieList;
    }

    /**
     * Database simulation : load one movie by its id
     * @param id movie's id
     * @return one movie
     */
    public Movie findOneMovie(int id) {

        return findAllMovies().get(id);
    }
}
