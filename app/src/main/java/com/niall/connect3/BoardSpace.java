package com.niall.connect3;


public class BoardSpace {

    private boolean isAvailable = true;
    private String placedCounterSymbol = "";

    public void placeCounter(Counter counter) {
        isAvailable = false;
        switch (counter.getCounterColour()) {
            case RED:
                placedCounterSymbol = "R";
                break;
            case YELLOW:
                placedCounterSymbol = "Y";
                break;
        }
    }

    public boolean isSpaceAvailable() {
        return isAvailable;
    }

    public String getPlacedCounterSymbol() {
        return placedCounterSymbol;
    }

}

