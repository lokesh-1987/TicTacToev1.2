package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final char CROSS = 'X';
    private static final char ZERO = '0';

    @Test
    public void ticTacToeGameShouldReturn_EmptyString_IfPlayer_X_MovesOn_0_0_Position() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,0, CROSS), is(EMPTY_STRING));
    }

    @Test
    public void ticTacToeGameShouldReturn_GameIsDrawMessage_ifThePlayersMoveAlternativelyUntilGameIsDraw() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,0, CROSS), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,1, ZERO), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2, CROSS), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,0, ZERO), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,1, CROSS), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,2, ZERO), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,1, CROSS), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,0, ZERO), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,2, CROSS), is(GAME_IS_DRAW));
    }
}
