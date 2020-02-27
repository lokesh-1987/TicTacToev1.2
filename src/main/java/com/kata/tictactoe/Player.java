package com.kata.tictactoe;

public enum Player {
    X('X'), O('0');

    private char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }
}
