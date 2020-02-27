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
    private static final String PLAYER_0_PLAYS_ON_THE_PLAYED_POSITION = "Player 0 plays on the played position.";
    private static final String PLAYER_X_WON = "Player X Won!";
    private static final String PLAYER_0_WON = "Player 0 Won!";
    private TicTacToeGame ticTacToeGame;
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    @Before
    public void setUp() {
        ticTacToeGame = new TicTacToeGame(ticTacToeBoard);
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
        assertThat(ticTacToeGame.playGame(0,1,'0'), is(PLAYER_0_PLAYS_ON_THE_PLAYED_POSITION));
    }

    @Test
    public void ticTacToeGameShouldReturn_WinningMessage_IfPlayerXCompletesFirstRow() {
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,1,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,1,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeGameShouldReturn_WinningMessage_IfPlayerOCompletesLastRow() {
        assertThat(ticTacToeGame.playGame(0,0,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,1,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(0,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,0,'0'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(1,2,'X'), is(EMPTY_STRING));
        assertThat(ticTacToeGame.playGame(2,2,'0'), is(PLAYER_0_WON));
    }
}
