package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private Movie movieToAdd = new Movie(100, "T100", "nonsence");

    @BeforeEach
    void setUp() {
        manager.addMovie(movieToAdd);
    }

    @Test
    public void shouldGetNoveltiesNegative() {
        Movie[] actual = manager.getLimited(-25);
        Movie[] expected = {
                new Movie(100, "T100", "nonsence"),
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(13, "Terminator13", "nonsence"),
                new Movie(12, "Terminator12", "nonsence"),
                new Movie(11, "Terminator11", "nonsence"),
                new Movie(10, "Terminator10", "nonsence"),
                new Movie(9, "Terminator9", "nonsence"),
                new Movie(8, "Terminator8", "nonsence"),
                new Movie(7, "Terminator7", "nonsence"),
                new Movie(6, "Terminator6", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetNoveltiesMoreThanAll() {
        Movie[] actual = manager.getLimited(100);
        Movie[] expected = {
                new Movie(100, "T100", "nonsence"),
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(13, "Terminator13", "nonsence"),
                new Movie(12, "Terminator12", "nonsence"),
                new Movie(11, "Terminator11", "nonsence"),
                new Movie(10, "Terminator10", "nonsence"),
                new Movie(9, "Terminator9", "nonsence"),
                new Movie(8, "Terminator8", "nonsence"),
                new Movie(7, "Terminator7", "nonsence"),
                new Movie(6, "Terminator6", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetNoveltiesPositive() {
        Movie[] actual = manager.getLimited(6);
        Movie[] expected = {
                new Movie(100, "T100", "nonsence"),
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(13, "Terminator13", "nonsence"),
                new Movie(12, "Terminator12", "nonsence"),
                new Movie(11, "Terminator11", "nonsence"),
                new Movie(10, "Terminator10", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetNoveltiesBetweenSizeAndDefault() {
        Movie[] actual = manager.getLimited(11);
        Movie[] expected = {
                new Movie(100, "T100", "nonsence"),
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(13, "Terminator13", "nonsence"),
                new Movie(12, "Terminator12", "nonsence"),
                new Movie(11, "Terminator11", "nonsence"),
                new Movie(10, "Terminator10", "nonsence"),
                new Movie(9, "Terminator9", "nonsence"),
                new Movie(8, "Terminator8", "nonsence"),
                new Movie(7, "Terminator7", "nonsence"),
                new Movie(6, "Terminator6", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        Movie[] actual = manager.getAll();
        Movie[] expected = {
                new Movie(100, "T100", "nonsence"),
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(13, "Terminator13", "nonsence"),
                new Movie(12, "Terminator12", "nonsence"),
                new Movie(11, "Terminator11", "nonsence"),
                new Movie(10, "Terminator10", "nonsence"),
                new Movie(9, "Terminator9", "nonsence"),
                new Movie(8, "Terminator8", "nonsence"),
                new Movie(7, "Terminator7", "nonsence"),
                new Movie(6, "Terminator6", "nonsence"),
                new Movie(5, "Terminator5", "nonsence"),
                new Movie(4, "Terminator4", "farce"),
                new Movie(3, "Terminator3", "tragedy"),
                new Movie(2, "Terminator2", "sci-fi"),
                new Movie(1, "Terminator1", "sci-fi"),
        };
        assertArrayEquals(expected, actual);
    }

}
