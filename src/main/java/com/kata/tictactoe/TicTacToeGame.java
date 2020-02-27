package com.kata.tictactoe;

class TicTacToeGame {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final String PLAYER = "Player ";
    private static final String PLAYS_ON_THE_PLAYED_POSITION = " plays on the played position.";
    private static final String WON = " Won!";
    private TicTacToeBoard ticTacToeBoard;

    TicTacToeGame(TicTacToeBoard ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
    }

    String playGame(int row, int col, char playerSymbol) {
        if (ticTacToeBoard.isPositionOccupied(row,col)) {
            return PLAYER +playerSymbol+ PLAYS_ON_THE_PLAYED_POSITION;
        }
        ticTacToeBoard.setValue(row,col,playerSymbol);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        } else if (ticTacToeBoard.isAnyOfTheRowFullOfEitherXOr0(playerSymbol)
                || ticTacToeBoard.isFirstColumnFullOfEitherXOr0(playerSymbol)
                || ticTacToeBoard.isSecondColumnFullOfEitherXOr0(playerSymbol)) {
            return PLAYER+playerSymbol+ WON;
        }
        return EMPTY_STRING;
    }
}
