package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;
import ru.netology.domain.AfishaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository();
    private Afisha movieToAdd = new Afisha(1000, "T1000", "nonsence");

    @BeforeEach
    void setUp() {
        repository.save(movieToAdd);
    }

    @Test
    void findAll() {
        Afisha[] actual = repository.findAll();
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
                new Afisha(6, "Terminator6", "nonsence"),
                new Afisha(7, "Terminator7", "nonsence"),
                new Afisha(8, "Terminator8", "nonsence"),
                new Afisha(9, "Terminator9", "nonsence"),
                new Afisha(10, "Terminator10", "nonsence"),
                new Afisha(11, "Terminator11", "nonsence"),
                new Afisha(12, "Terminator12", "nonsence"),
                new Afisha(13, "Terminator13", "nonsence"),
                new Afisha(14, "Terminator14", "nonsence")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void removeById() {
    }

    @Test
    void removeAll() {
    }
}