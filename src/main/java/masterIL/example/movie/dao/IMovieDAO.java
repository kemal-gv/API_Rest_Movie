package masterIL.example.movie.dao;

import masterIL.example.movie.model.Movie;

import java.util.List;

public interface IMovieDAO {
    List<Movie> findAll();
    Movie findById(int id);
    void save(Movie movie);
    void delete(int id);
    void update(Movie movie, int id);
}
