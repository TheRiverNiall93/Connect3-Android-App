package com.niall.connect3;


public class Game {

    private GameBoard board;
    private Player[] players;
    private Player currentPlayer;

    public Game() {
        this.board = new GameBoard();
        this.players = new Player[2];

        players[0] = new Player("Player 1", new Counter(Counter.CounterColour.RED));
        players[1] = new Player("Player 2", new Counter(Counter.CounterColour.YELLOW));

        this.currentPlayer = players[0];
    }

    public void placeCounter(int spacePosition) {
        this.board.placeCounterOnSelectedSpace(spacePosition, currentPlayer.getPlayersCounter());
    }

    public boolean isSelectedSpaceAvailable(int spacePosition) {
        return this.board.isSelectedSpaceAvailable(spacePosition);
    }

    public void switchCurrentPlayer() {
        if (currentPlayer.equals(players[0])) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }
    }

    public Counter.CounterColour getCurrentCounterColour() {
        return this.currentPlayer.getPlayersCounter().getCounterColour();
    }

    public boolean isWinner() {
        return this.board.isWinner();
    }

    public boolean isBoardFilled() {
        return this.board.isFilled();
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public void reset() {
        this.currentPlayer = players[0];
        this.board.reset();
    }

    public void increaseCurrentPlayersScore() {
        this.currentPlayer.increaseScore();
    }

    public String getScoreDisplayText() {
        return players[0].getName() + ": " + players[0].getScore()
                + "\t\t" + players[1].getName() + ": " + players[1].getScore();
    }
}
