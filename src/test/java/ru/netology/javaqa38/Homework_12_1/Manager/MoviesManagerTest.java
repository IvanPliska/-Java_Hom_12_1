package ru.netology.javaqa38.Homework_12_1.Manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void showCountFilmNoLimit() {
        MoviesManager manager = new MoviesManager();
        manager.addFilm("First");
        manager.addFilm("Second");
        manager.addFilm("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAllFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showCountFilmToLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.addFilm("First");
        manager.addFilm("Second");
        manager.addFilm("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAllFilm();

        assertArrayEquals(expected, actual);
    }

    @Test // Лимит для показа фильмов не существует
    public void showCountFilmToMinLimit() {
        MoviesManager manager = new MoviesManager(-10);
        manager.addFilm("First");
        manager.addFilm("Second");
        manager.addFilm("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAllFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsInLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.addFilm("First");
        manager.addFilm("Second");
        manager.addFilm("Third");

        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLastFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsUnderLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.addFilm("First");
        manager.addFilm("Second");
        manager.addFilm("Third");
        manager.addFilm("Fourth");
        manager.addFilm("Fifth");
        manager.addFilm("Sixth");
        manager.addFilm("Seventh");
        manager.addFilm("Eighth");
        manager.addFilm("Ninth");
        manager.addFilm("Tenth");
        manager.addFilm("Eleventh");

        String[] expected = { "Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth",  "Third", "Second",};
        String[] actual = manager.findLastFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsLimitZero() {
        MoviesManager manager = new MoviesManager(0);
        manager.addFilm("First");
        manager.addFilm("Second");
        manager.addFilm("Third");
        manager.addFilm("Fourth");
        manager.addFilm("Fifth");
        manager.addFilm("Sixth");
        manager.addFilm("Seventh");
        manager.addFilm("Eighth");
        manager.addFilm("Ninth");
        manager.addFilm("Tenth");
        manager.addFilm("Eleventh");

        String[] expected = {};
        String[] actual = manager.findLastFilm();

        assertArrayEquals(expected, actual);
    }
}
