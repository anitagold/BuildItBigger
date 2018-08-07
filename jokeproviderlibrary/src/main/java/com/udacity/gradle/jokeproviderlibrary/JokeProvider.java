package com.udacity.gradle.jokeproviderlibrary;

import java.util.Random;

public class JokeProvider {

    private String[] jokes;
    private Random random;

    public JokeProvider() {
        jokes = new String[5];
        jokes[0] = "Programmer (noun.)\n" +
                "A machine that turns coffee into code.";
        jokes[1] = "Two programmers talk:\n" +
                "-Did you really choose your dog\'s name as a password?\n" +
                "-Why? What is the problem with x8935dcs35AdGx%jksKXRfh674?";
        jokes[2] = "-Two SQL Database walked into a NoSQL bar. A little while later they walked out. Why?\n" +
                "-Because they could not find a table.";
        jokes[3] = "-What do computers and air conditioners have in common?\n" +
                "-They both become useless when you open windows.\n";
        jokes[4] = "-Why do Java programmers have to wear glasses?\n" +
                "-Because they do not C#.\n";
        random = new Random();

    }

    public String[] getJokes() {
        return jokes;
    }

    public String getMixedJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
