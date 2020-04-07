package ru.netology.repository;

import ru.netology.domain.Movie;

public class MovieRepository {
    private Movie[] movies = {
            new Movie(1, "Terminator1", "sci-fi"),
            new Movie(2, "Terminator2", "sci-fi"),
            new Movie(3, "Terminator3", "tragedy"),
            new Movie(4, "Terminator4", "farce"),
            new Movie(5, "Terminator5", "nonsence"),
            new Movie(6, "Terminator6", "nonsence"),
            new Movie(7, "Terminator7", "nonsence"),
            new Movie(8, "Terminator8", "nonsence"),
            new Movie(9, "Terminator9", "nonsence"),
            new Movie(10, "Terminator10", "nonsence"),
            new Movie(11, "Terminator11", "nonsence"),
            new Movie(12, "Terminator12", "nonsence"),
            new Movie(13, "Terminator13", "nonsence"),
            new Movie(14, "Terminator14", "nonsence")
    };

    public Movie[] findAll() {
        return movies;
    }

    public void save(Movie movie) {
        Movie[] tmpArray = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, tmpArray, 0, movies.length);
        int lastIndex = tmpArray.length - 1;
        tmpArray[lastIndex] = movie;
        movies = tmpArray;
    }

    public Movie findById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    void removeById(int id) {
        int length = movies.length - 1;
        Movie[] tmpArray = new Movie[length];
        int i = 0;
        for (Movie movie : movies) {
            if (movie.getId() != id) {
                tmpArray[i] = movie;
                i++;
            }
        }
        movies = tmpArray;
    }

    void removeAll() {
        movies = new Movie[0];
    }
}
