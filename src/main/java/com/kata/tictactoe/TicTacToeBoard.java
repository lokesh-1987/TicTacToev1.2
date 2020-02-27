package com.kata.tictactoe;

class TicTacToeBoard {
    char[][] board;

    TicTacToeBoard() {
        this.board = new char[3][3];
    }

    public void setUpBoard() {
        this.board[0][0] = '-';
        this.board[0][1] = '-';
    }
}
