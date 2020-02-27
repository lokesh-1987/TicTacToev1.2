package com.kata.tictactoe;

public enum Player {
    X('X'), O('0');

    private char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    char getPlayerSymbol() {
        return this.symbol;
    }

    Player switchPlayer(char symbol) {
        return symbol == Player.X.symbol ? Player.O : Player.X;
    }
}
