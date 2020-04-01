package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class AfishaManagerMockitoTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
    Afisha first = new Afisha(333, "T333", "Mockito");
    Afisha second = new Afisha(444, "T444", "Mockito");
    Afisha third = new Afisha(555, "T555", "Mockito");

    @Test
    void addMovieWithMock() {
        Afisha[] returned = new Afisha[]{first, second, third};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(third);
        manager.addMovie(third);
        Afisha[] expected = new Afisha[]{third, second, first};
        Afisha[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}