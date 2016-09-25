package com.niall.connect3;

public class Counter {

    public enum CounterColour { RED, YELLOW };
    private CounterColour colour;

    public Counter(CounterColour colour) {
        this.colour = colour;
    }

    public CounterColour getCounterColour() {
        return this.colour;
    }
}
