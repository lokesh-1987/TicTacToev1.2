package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
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

    @Test
    public void ticTacToeBoardShouldReturnXAtIndex_02_WhenSetValueIsXAtIndex_02() {
        ticTacToeBoard.setValue(0,2, 'X');
        assertThat(ticTacToeBoard.board[0][2], is('X'));
    }

    @Test
    public void ticTacToeBoardShouldGet0AtIndex_20_WhenSetValueIs0AtThatIndex() {
        ticTacToeBoard.setValue(2,0, '0');
        assertThat(ticTacToeBoard.getValue(2, 0), is('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhenXIsOccupiedAtIndex_1_1(){
        ticTacToeBoard.setValue(1,1, 'X');
        assertTrue(ticTacToeBoard.isPositionOccupied(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhen0IsOccupiedAtIndex_1_1(){
        ticTacToeBoard.setValue(1,1, '0');
        assertTrue(ticTacToeBoard.isPositionOccupied(1, 1));
    }
}
