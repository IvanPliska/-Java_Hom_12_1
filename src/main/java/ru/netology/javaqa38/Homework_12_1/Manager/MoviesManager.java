package ru.netology.javaqa38.Homework_12_1.Manager;

public class MoviesManager {
    private String[] movies = new String[0];
    private int limit;

    public MoviesManager() {
        limit = 10;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAllFilm() {
        return movies;

    }

    public String[] findLastFilm() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
