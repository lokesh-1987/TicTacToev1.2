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
}
