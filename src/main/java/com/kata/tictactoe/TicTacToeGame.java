package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playGame(int row, int col, char playerSymbol) {
        ticTacToeBoard.setValue(row,col,playerSymbol);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        return EMPTY_STRING;
    }
}
