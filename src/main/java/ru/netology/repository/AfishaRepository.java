package ru.netology.repository;

import ru.netology.domain.Afisha;

public class AfishaRepository {
    private Afisha[] movies = {
            new Afisha(1, "Terminator1", "sci-fi"),
            new Afisha(2, "Terminator2", "sci-fi"),
            new Afisha(3, "Terminator3", "tragedy"),
            new Afisha(4, "Terminator4", "farce"),
            new Afisha(5, "Terminator5", "nonsence"),
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

    //    findAll - возвращает массив всех хранящихся в массиве объектов
    public Afisha[] findAll() {
        return movies;
    }

    //    save - добавляет объект в массив
    public void save(Afisha movie) {
        Afisha[] tmpArray = new Afisha[movies.length + 1];
        System.arraycopy(movies, 0, tmpArray, 0, movies.length);
        int lastIndex = tmpArray.length - 1;
        tmpArray[lastIndex] = movie;
        movies = tmpArray;
    }

    //    findById - возвращает объект по идентификатору (либо null, если такого объекта нет)
    public Afisha findById(int id) {
        for (Afisha movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    //    removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    void removeById(int id) {
        int length = movies.length - 1;
        Afisha[] tmpArray = new Afisha[length];
        int i = 0;
        for (Afisha movie : movies) {
            if (movie.getId() != id) {
                tmpArray[i] = movie;
                i++;
            }
        }
        movies = tmpArray;
    }

    //    removeAll*
    void removeAll() {
        Afisha[] backupMovies = new Afisha[movies.length];
        System.arraycopy(movies, 0, backupMovies, 0, movies.length);
        for (Afisha backupMovie : backupMovies) {
            System.out.println(backupMovie);
        }
        movies = new Afisha[0];
    }
}
