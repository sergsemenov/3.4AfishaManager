package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private Afisha movieToAdd = new Afisha(1000, "T1000", "nonsence");

    @BeforeEach
    void setUp () {
        manager.addMovie(movieToAdd);
    }

    @Test
    public void showAllNegative() {
        Afisha[] actual = manager.getMovies(-25);
        Afisha[] expected = {
                new Afisha(1000, "T1000", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence"),
                new Afisha(9, "Terminator9", "nonsence"),
                new Afisha(8, "Terminator8", "nonsence"),
                new Afisha(7, "Terminator7", "nonsence"),
                new Afisha(6, "Terminator6", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showMoreThanAll() {
        Afisha[] actual = manager.getMovies(100);
        Afisha[] expected = {
                new Afisha(1000, "T1000", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence"),
                new Afisha(9, "Terminator9", "nonsence"),
                new Afisha(8, "Terminator8", "nonsence"),
                new Afisha(7, "Terminator7", "nonsence"),
                new Afisha(6, "Terminator6", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllPositive() {
        Afisha[] actual = manager.getMovies(6);
        Afisha[] expected = {
                new Afisha(1000, "T1000", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllBetweenSizeAndDefault() {
        Afisha[] actual = manager.getMovies(11);
        Afisha[] expected = {
                new Afisha(1000, "T1000", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence"),
                new Afisha(9, "Terminator9", "nonsence"),
                new Afisha(8, "Terminator8", "nonsence"),
                new Afisha(7, "Terminator7", "nonsence"),
                new Afisha(6, "Terminator6", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }
}
