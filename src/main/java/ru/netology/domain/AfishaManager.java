package ru.netology.domain;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repository;
    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void addMovie(Afisha movie) {
       repository.save(movie);
    }

    public Afisha[] getMovies(int howManyMoviesToShow) {
        Afisha[] movies = repository.findAll();
        int moviesLength = movies.length;
        int feedMax = 10; //по умолчанию показываем столько
        if (howManyMoviesToShow <= 0 || howManyMoviesToShow > feedMax) { //если заказано 0 и меньше, или очень много,
            howManyMoviesToShow = feedMax; // показываем 10 по умолчанию
        }
        if (feedMax > moviesLength) { // если массив оказывается меньше дефолтного значения
            feedMax = moviesLength; // показываем сколько есть в массиве
        }
        if (howManyMoviesToShow <= feedMax) { //если запрос на показ, с учетом предыдущих условий,
            feedMax = howManyMoviesToShow; // нас удовлетворяет (> 0 и < массива), то показываем сколько заказано
        } else {
            feedMax = moviesLength; // а если нет, то сколько есть в массиве
        }
        Afisha[] customAfisha = new Afisha[feedMax];
        for (int iCurrent = 0; iCurrent < customAfisha.length; iCurrent++) { //выводим ленту с учетом заказа и
            int iResult = moviesLength - iCurrent - 1; //того требования, что последние фильмы должны показываться
            customAfisha[iCurrent] = movies[iResult]; //первыми, поэтому в новом массиве перенумеровываем их
        }
        return customAfisha;
    }
}
