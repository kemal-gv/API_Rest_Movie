package masterIL.example.movie.web.controller;

import masterIL.example.movie.dao.IMovieDAO;
import masterIL.example.movie.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private IMovieDAO dao;

    @GetMapping(value="/Movies")
    public List<Movie> getMovies() {
        return dao.findAll();
    }

    @GetMapping(value="/Movies/{id}")
    public Movie getMovie(@PathVariable int id) {
        return dao.findById(id);
    }

    @PostMapping(value="Movie")
    public void addMovie(@RequestBody Movie movie) {
        dao.save(movie);
    }

    @DeleteMapping(value="/Movies/{id}")
    public void delete(@PathVariable int id) {
        dao.delete(id);
    }

    @PutMapping(value="/Movies/{id}")
    public void update(@RequestBody Movie movie, @PathVariable int id) {
        dao.update(movie, id);
    }

}
