package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Afisha {
    private int id;
    private String title;
    private String genre;

    public int getId() {
        return id;
    }
}
