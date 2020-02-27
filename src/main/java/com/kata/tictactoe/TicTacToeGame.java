package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playGame(int row, int col, char playerSymbol) {
        if (ticTacToeBoard.isPositionOccupied(row,col)) {
            return "Player "+playerSymbol+" plays on the played position.";
        }
        ticTacToeBoard.setValue(row,col,playerSymbol);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        return EMPTY_STRING;
    }
}
