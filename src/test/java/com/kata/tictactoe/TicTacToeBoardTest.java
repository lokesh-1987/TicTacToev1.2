package com.kata.tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private static final char HYPHEN = '-';
    private static final char ZERO = '0';
    private static final char CROSS = 'X';
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
        ticTacToeBoard.setValue(0,2, CROSS);
        assertThat(ticTacToeBoard.board[0][2], is(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldGet0AtIndex_20_WhenSetValueIs0AtThatIndex() {
        ticTacToeBoard.setValue(2,0, ZERO);
        assertThat(ticTacToeBoard.getValue(2, 0), is(ZERO));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhenXIsOccupiedAtIndex_1_1(){
        ticTacToeBoard.setValue(1,1, CROSS);
        assertTrue(ticTacToeBoard.isPositionOccupied(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhen0IsOccupiedAtIndex_1_1(){
        ticTacToeBoard.setValue(1,1, ZERO);
        assertTrue(ticTacToeBoard.isPositionOccupied(1, 1));
    }
    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstRowIsFullOfO() {
        ticTacToeBoard.setValue(0,0, ZERO);
        ticTacToeBoard.setValue(0,1, ZERO);
        ticTacToeBoard.setValue(0,2, ZERO);
        assertTrue(ticTacToeBoard.isFirstRowFullOfEitherXOr0(ZERO));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstRowIsFullOfX() {
        ticTacToeBoard.setValue(0,0, CROSS);
        ticTacToeBoard.setValue(0,1, CROSS);
        ticTacToeBoard.setValue(0,2, CROSS);
        assertTrue(ticTacToeBoard.isFirstRowFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondRowIsFullOfX() {
        ticTacToeBoard.setValue(1,0, CROSS);
        ticTacToeBoard.setValue(1,1, CROSS);
        ticTacToeBoard.setValue(1,2, CROSS);
        assertTrue(ticTacToeBoard.isSecondRowFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfLastRowIsFullOf0() {
        ticTacToeBoard.setValue(2,0, ZERO);
        ticTacToeBoard.setValue(2,1, ZERO);
        ticTacToeBoard.setValue(2,2, ZERO);
        assertTrue(ticTacToeBoard.isLastRowFullOfEitherXOr0(ZERO));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstColumnIsFullOf0() {
        ticTacToeBoard.setValue(0,0, ZERO);
        ticTacToeBoard.setValue(1,0, ZERO);
        ticTacToeBoard.setValue(2,0, ZERO);
        assertTrue(ticTacToeBoard.isFirstColumnFullOfEitherXOr0(ZERO));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondColumnIsFullOfX() {
        ticTacToeBoard.setValue(0,1, CROSS);
        ticTacToeBoard.setValue(1,1, CROSS);
        ticTacToeBoard.setValue(2,1, CROSS);
        assertTrue(ticTacToeBoard.isSecondColumnFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfLastColumnIsFullOfX() {
        ticTacToeBoard.setValue(0,2, CROSS);
        ticTacToeBoard.setValue(1,2, CROSS);
        ticTacToeBoard.setValue(2,2, CROSS);
        assertTrue(ticTacToeBoard.isLastColumnFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstDiagonalIsFullOf0() {
        ticTacToeBoard.setValue(0,2, ZERO);
        ticTacToeBoard.setValue(1,1, ZERO);
        ticTacToeBoard.setValue(2,0, ZERO);
        assertTrue(ticTacToeBoard.isFirstDiagonalFullOfEitherXOr0(ZERO));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,0, CROSS);
        ticTacToeBoard.setValue(1,1, CROSS);
        ticTacToeBoard.setValue(2,2, CROSS);
        assertTrue(ticTacToeBoard.isSecondDiagonalFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfAnyOfTheRowIsFullOfO() {
        ticTacToeBoard.setValue(0,0, ZERO);
        ticTacToeBoard.setValue(0,1, ZERO);
        ticTacToeBoard.setValue(0,2, ZERO);
        assertTrue(ticTacToeBoard.isAnyOfTheRowFullOfEitherXOr0(ZERO));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfAnyOfTheColumnIsFullOfX() {
        ticTacToeBoard.setValue(0,2, CROSS);
        ticTacToeBoard.setValue(1,2, CROSS);
        ticTacToeBoard.setValue(2,2, CROSS);
        assertTrue(ticTacToeBoard.isAnyOfTheColumnFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,0, CROSS);
        ticTacToeBoard.setValue(1,1, CROSS);
        ticTacToeBoard.setValue(2,2, CROSS);
        assertTrue(ticTacToeBoard.isEitherOfDiagonalFullOfEitherXOr0(CROSS));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFull() {
        ticTacToeBoard.setValue(0,0, CROSS);
        ticTacToeBoard.setValue(0,1, ZERO);
        ticTacToeBoard.setValue(0,2, CROSS);
        ticTacToeBoard.setValue(1,0, ZERO);
        ticTacToeBoard.setValue(1,1, CROSS);
        ticTacToeBoard.setValue(1,2, ZERO);
        ticTacToeBoard.setValue(2,1, CROSS);
        ticTacToeBoard.setValue(2,0, ZERO);
        ticTacToeBoard.setValue(2,2, CROSS);
        Assert.assertTrue(ticTacToeBoard.isBoardFull());
    }

    @Test
    public void ticTacToeBoardShouldBeDisplayedWithHyphenSymbolsBeforeGameStarts() {
        ticTacToeBoard.setUpBoard();
        ticTacToeBoard.displayBoard();
    }
    @Test
    public void ticTacToeBoardShouldDisplayXOnFirstMoveAtIndex_00() {
        ticTacToeBoard.setUpBoard();
        ticTacToeBoard.setValue(0,0,'X');
        ticTacToeBoard.displayBoard();
        assertThat(ticTacToeBoard.getValue(0,0), is('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnIntArrayOfIndex_00_ForPosition1() throws InvalidPositionException {
        assertThat(ticTacToeBoard.getBoardIndex(1), is(new int[]{0,0}));
    }

    @Test
    public void ticTacToeBoardShouldReturnIntArrayOfIndex_01_ForPosition2() throws InvalidPositionException {
        assertThat(ticTacToeBoard.getBoardIndex(2), is(new int[]{0,1}));
    }

    @Test(expected = InvalidPositionException.class)
    public void ticTacToeBoardShouldReturnExceptionIfThePositionIsGreaterThan9() throws InvalidPositionException {
        int [] boardIndex = ticTacToeBoard.getBoardIndex(10);
    }

    @Test(expected = InvalidPositionException.class)
    public void ticTacToeBoardShouldReturnExceptionIfThePositionIsLessThan1() throws InvalidPositionException {
        int [] boardIndex = ticTacToeBoard.getBoardIndex(0);
    }
}