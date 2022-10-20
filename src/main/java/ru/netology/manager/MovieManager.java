package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.Movie;

@Data
public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int limit;

    public MovieManager() {
        limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(Movie film) {
        Movie[] tmp = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public Movie[] findALL() {
        return movies;
    }

    public Movie[] findLast() {
        Movie[] result;
        if (limit < movies.length) {
            result = new Movie[limit];
        } else {
            result = new Movie[movies.length];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }
}
