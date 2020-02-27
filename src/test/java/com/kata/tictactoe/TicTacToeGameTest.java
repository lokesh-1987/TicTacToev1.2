package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String EMPTY_STRING = "";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final char CROSS = 'X';
    private static final char ZERO = '0';
    private TicTacToeGame ticTacToeGame;

    @Before
    public void setUp() {
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void ticTacToeGameShouldReturn_EmptyString_IfPlayer_X_MovesOn_0_0_Position() {
        assertThat(ticTacToeGame.playGame(0,0, CROSS), is(EMPTY_STRING));
    }

    @Test
    public void ticTacToeGameShouldReturn_GameIsDrawMessage_ifThePlayersMoveAlternativelyUntilGameIsDraw() {
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

    @Test
    public void ticTacToeGameShouldReturn_PositionMessage_IfPlayerOPlaysOnPlayedPosition() {
        assertThat(ticTacToeGame.playGame(0,1,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,1,'0'), is("Player 0 plays on the played position."));
    }
}
