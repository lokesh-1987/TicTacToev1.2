package com.kata.tictactoe;

class TicTacToeBoard {
    char[][] board;

    TicTacToeBoard() {
        this.board = new char[3][3];
    }

    public void setUpBoard() {
        for (int row = 0; row < this.board.length; row++) {
            for (int column = 0; column < this.board[row].length; column++) {
                this.board[row][column] = '-';
            }
        }
    }
}
