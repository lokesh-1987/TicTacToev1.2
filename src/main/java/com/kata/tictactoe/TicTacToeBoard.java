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
}
