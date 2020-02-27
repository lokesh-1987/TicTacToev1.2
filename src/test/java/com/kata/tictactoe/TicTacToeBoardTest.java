package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf3AfterDeclaration() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        assertThat(ticTacToeBoard.board.length, is(3));
    }

    @Test
    public void ticTacToeBoardShouldReturn_HyphenSymbol_AtIndex_00_AfterSetUp() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        ticTacToeBoard.setUpBoard();
        assertThat(ticTacToeBoard.board[0][0], is('-'));
    }
}
