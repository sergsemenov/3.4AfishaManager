package ru.netology.domain;

public class AfishaManager {
    Afisha[] movies = {
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

    public void addMovie(Afisha movie) {
        int moviesLength = movies.length;
        Afisha[] tmpArray = new Afisha[moviesLength + 1];
        System.arraycopy(movies, 0, tmpArray, 0, moviesLength);
        int lastIndex = tmpArray.length - 1;
        tmpArray[lastIndex] = movie;
        movies = tmpArray;
    }

    public Afisha[] getMovies(int howManyMoviesToShow) {
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
