package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String EMPTY_STRING = "";

    @Test
    public void ticTacToeGameShouldReturn_EmptyString_IfPlayer_X_MovesOn_0_0_Position() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,0, 'X'), is(EMPTY_STRING));
    }

    @Test
    public void ticTacToeGameShouldReturn_GameIsDrawMessage_ifThePlayersMoveAlternativelyUntilGameIsDraw() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,1,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,1,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,2,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,1,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,2,'X'), is("Game is Draw!"));
    }
}
