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

    boolean isFirstRowFullOfEitherXOr0(char value) {
        return this.getValue(0,0) == value
                && this.getValue(0,1) == value
                && this.getValue(0,2) == value;
    }

    boolean isSecondRowFullOfEitherXOr0(char value) {
        return this.getValue(1,0) == value
                && this.getValue(1,1) == value
                && this.getValue(1,2) == value;
    }

    boolean isLastRowFullOfEitherXOr0(char value) {
        return this.getValue(2,0) == value
                && this.getValue(2,1) == value
                && this.getValue(2,2) == value;
    }

    boolean isFirstColumnFullOfEitherXOr0(char value) {
        return this.getValue(0,0) == value
                && this.getValue(1,0) == value
                && this.getValue(2,0) == value;
    }

    boolean isSecondColumnFullOfEitherXOr0(char value) {
        return this.getValue(0,1) == value
                && this.getValue(1,1) == value
                && this.getValue(2,1) == value;
    }

    boolean isLastColumnFullOfEitherXOr0(char value) {
        return this.getValue(0,2) == value
                && this.getValue(1,2) == value
                && this.getValue(2,2) == value;
    }

    boolean isFirstDiagonalFullOfEitherXOr0(char value) {
        return this.getValue(0,2) == value
                && this.getValue(1,1) == value
                && this.getValue(2,0) == value;
    }

    boolean isSecondDiagonalFullOfEitherXOr0(char value) {
        return this.getValue(0,0) == value
                && this.getValue(1,1) == value
                && this.getValue(2,2) == value;
    }

    boolean isAnyOfTheRowFullOfEitherXOr0(char value) {
        return isFirstRowFullOfEitherXOr0(value)
                || isSecondRowFullOfEitherXOr0(value)
                || isLastRowFullOfEitherXOr0(value);
    }

    boolean isAnyOfTheColumnFullOfEitherXOr0(char value) {
        return isFirstColumnFullOfEitherXOr0(value)
                || isSecondColumnFullOfEitherXOr0(value)
                || isLastColumnFullOfEitherXOr0(value);
    }

    boolean isEitherOfDiagonalFullOfEitherXOr0(char value) {
        return isFirstDiagonalFullOfEitherXOr0(value)
                || isSecondDiagonalFullOfEitherXOr0(value);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < board.length; i+=2) {
            for (int j = 0; j < board[i].length; j+=2) {
                if (getValue(i, j) != 'X' && getValue(i, j) != '0') {
                    return false;
                }
            }
        }
        return true;
    }

    public void displayBoard() {
        for (char[] row : this.board){
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
