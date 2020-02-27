package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private static final char HYPHEN = '-';
    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf3AfterDeclaration() {
        assertThat(ticTacToeBoard.board.length, is(3));
    }

    @Test
    public void ticTacToeBoardShouldReturn_HyphenSymbol_AtIndex_00_AfterSetUp() {
        ticTacToeBoard.setUpBoard();
        assertThat(ticTacToeBoard.board[0][0], is(HYPHEN));
    }

    @Test
    public void ticTacToeBoardShouldReturn_HyphenSymbol_AtIndex_01_AfterSetUp() {
        ticTacToeBoard.setUpBoard();
        assertThat(ticTacToeBoard.board[0][1], is(HYPHEN));
    }
}
