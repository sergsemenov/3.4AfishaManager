package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    Movie[] movies = {
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

    public void addMovie(Movie movie) {
        int moviesLength = movies.length;
        Movie[] tmpArray = new Movie[moviesLength + 1];
        System.arraycopy(movies, 0, tmpArray, 0, moviesLength);
        int lastIndex = tmpArray.length - 1;
        tmpArray[lastIndex] = movie;
        movies = tmpArray;
    }

    public Movie[] getLimited(int howManyMoviesToShow) {
        int moviesLength = movies.length;
        int feedMax = 10;
        if (howManyMoviesToShow <= 0 || howManyMoviesToShow > feedMax) {
            howManyMoviesToShow = feedMax;
        }
        if (feedMax > moviesLength) {
            feedMax = moviesLength;
        }
        if (howManyMoviesToShow <= feedMax) {
            feedMax = howManyMoviesToShow;
        } else {
            feedMax = moviesLength;
        }
        Movie[] customMovie = new Movie[feedMax];
        for (int current = 0; current < customMovie.length; current++) {
            int result = moviesLength - current - 1;
            customMovie[current] = movies[result];
        }
        return customMovie;
    }
}
