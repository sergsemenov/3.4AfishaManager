package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private Afisha movieToAdd = new Afisha(100, "T100", "nonsence");

    @BeforeEach
    void setUp() {
        manager.addMovie(movieToAdd);
    }

    @Test
    public void showMeNoveltiesNegative() {
        Afisha[] actual = manager.getMovies(-25);
        Afisha[] expected = {
                new Afisha(100, "T100", "nonsence"),
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
    public void showMeNoveltiesMoreThanAll() {
        Afisha[] actual = manager.getMovies(100);
        Afisha[] expected = {
                new Afisha(100, "T100", "nonsence"),
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
    public void showMeNoveltiesPositive() {
        Afisha[] actual = manager.getMovies(6);
        Afisha[] expected = {
                new Afisha(100, "T100", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showMeNoveltiesBetweenSizeAndDefault() {
        Afisha[] actual = manager.getMovies(11);
        Afisha[] expected = {
                new Afisha(100, "T100", "nonsence"),
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
    public void showMeAllOfThem() {
        Afisha[] actual = manager.showAll();
        Afisha[] expected = {
                new Afisha(100, "T100", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence"),
                new Afisha(9, "Terminator9", "nonsence"),
                new Afisha(8, "Terminator8", "nonsence"),
                new Afisha(7, "Terminator7", "nonsence"),
                new Afisha(6, "Terminator6", "nonsence"),
                new Afisha(5, "Terminator5", "nonsence"),
                new Afisha(4, "Terminator4", "farce"),
                new Afisha(3, "Terminator3", "tragedy"),
                new Afisha(2, "Terminator2", "sci-fi"),
                new Afisha(1, "Terminator1", "sci-fi"),
        };
        assertArrayEquals(expected, actual);
    }

}
