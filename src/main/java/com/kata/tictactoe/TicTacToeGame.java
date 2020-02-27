package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playGame(int row, int col, char playerSymbol) {
        ticTacToeBoard.setValue(row,col,playerSymbol);
        if (ticTacToeBoard.isBoardFull()) {
            return "Game is Draw!";
        }
        return EMPTY_STRING;
    }
}
