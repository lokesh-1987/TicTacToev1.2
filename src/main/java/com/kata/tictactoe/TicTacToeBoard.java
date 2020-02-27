package com.kata.tictactoe;

class TicTacToeBoard {
    private static final char HYPHEN = '-';
    private static final char CROSS = 'X';
    private static final char ZERO = '0';
    char[][] board;

    TicTacToeBoard() {
        this.board = new char[3][3];
    }

    void setUpBoard() {
        for (int row = 0; row < this.board.length; row++) {
            for (int column = 0; column < this.board[row].length; column++) {
                this.board[row][column] = HYPHEN;
            }
        }
    }

    void setValue(int row, int col, char value) {
        this.board[row][col] = value;
    }

    char getValue(int row, int col) {
        return this.board[row][col];
    }

    boolean isPositionOccupied(int row, int col) {
        return this.getValue(row,col) == CROSS || this.getValue(row,col) == ZERO;
    }

    public boolean isFirstRowFullOfEitherXOr0(char value) {
        return this.getValue(0,0) == value
                && this.getValue(0,1) == value
                && this.getValue(0,2) == value;
    }

    public boolean isSecondRowFullOfEitherXOr0(char value) {
        return this.getValue(1,0) == value
                && this.getValue(1,1) == value
                && this.getValue(1,2) == value;
    }
}
