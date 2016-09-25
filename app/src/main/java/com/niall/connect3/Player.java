package com.niall.connect3;

public class Player {

    private String name;
    private Counter counter;
    private int score;

    public Player(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
        score = 0;
    }

    public String getName() {
        return this.name;
    }

    public Counter getPlayersCounter() {
        return counter;
    }

    public void increaseScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }

}

