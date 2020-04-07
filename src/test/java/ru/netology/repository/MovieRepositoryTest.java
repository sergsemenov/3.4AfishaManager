package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieRepositoryTest {
    private MovieRepository repository = new MovieRepository();
    private Movie movieToAdd = new Movie(100, "T100", "nonsence");

    @BeforeEach
    void setUp() {
        repository.save(movieToAdd);
    }

    @Test
    void findAll() {
        Movie[] actual = repository.findAll();
        Movie[] expected = {
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
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(100, "T100", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void save() {
        Movie movieToAdd = new Movie(1000, "T1000", "nonsence");
        repository.save(movieToAdd);
        Movie[] actual = repository.findAll();
        Movie[] expected = {
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
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(100, "T100", "nonsence"),
                new Movie(1000, "T1000", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        Movie actual = repository.findById(100);
        Movie expected = new Movie(100, "T100", "nonsence");
        assertEquals(expected, actual);
    }

    @Test
    void removeById() {
        repository.removeById(1);
        Movie[] actual = repository.findAll();
        Movie[] expected = {
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
                new Movie(14, "Terminator14", "nonsence"),
                new Movie(100, "T100", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeByIdThatNotExist() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> repository.removeById(1111) );
    }

    @Test
    void removeAll() {
        repository.removeAll();
        Movie[] expected = {};
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}
