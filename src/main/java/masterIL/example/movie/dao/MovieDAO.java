package masterIL.example.movie.dao;

import masterIL.example.movie.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDAO implements IMovieDAO{
    private List<Movie> movies;

    public MovieDAO(){
        movies = new ArrayList<>();
    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public Movie findById(int id) {
        return movies.get(id);
    }

    @Override
    public void save(Movie movie) {
        movies.add(movie);
    }

    @Override
    public void delete(int id) {
        movies.remove(id);
    }

    @Override
    public void update(Movie movie, int id) {
        movies.set(id, movie);
    }
}
