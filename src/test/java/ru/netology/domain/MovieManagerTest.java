package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private Movie movieToAdd = new Movie(1000, "T1000", "nonsence");
    private Movie[] expected;

    @BeforeEach
    void setUp() {
        manager.addMovie(movieToAdd);
        expected = new Movie[]{
                new Movie(1000, "T1000", "nonsence"),
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
    }

    @Test
    public void showAllNegative() {
        Movie[] actual = manager.getLimited(-25);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showMoreThanAll() {
        Movie[] actual = manager.getLimited(100);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllPositive() {
        Movie[] actual = manager.getLimited(6);
        Movie[] expected = {
                new Movie(1000, "T1000", "nonsence"),
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(13, "Terminator13", "nonsence"),
                new Movie(12, "Terminator12", "nonsence"),
                new Movie(11, "Terminator11", "nonsence"),
                new Movie(10, "Terminator10", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllBetweenSizeAndDefault() {
        Movie[] actual = manager.getLimited(11);
        assertArrayEquals(expected, actual);
    }
}
