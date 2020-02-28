package com.kata.tictactoe;

import java.util.Scanner;

public class TicTacToeGameMain {

    private static final String PLAYER_0_PLAYS_ON_THE_PLAYED_POSITION = "Player 0 plays on the played position.";
    private static final String PLAYER_X_PLAYS_ON_THE_PLAYED_POSITION = "Player X plays on the played position.";
    private static final String EMPTY_STRING = "";

    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        TicTacToeGame ticTacToeGame = new TicTacToeGame(ticTacToeBoard);
        Player player = Player.X;

        ticTacToeBoard.setUpBoard();
        ticTacToeBoard.displayBoard();

        while(true) {
            System.out.println("Player " + player.name()+": Enter your placement (1 to 9) ::");
            int[] boardIndex;
            try {
                boardIndex = ticTacToeBoard.getBoardIndex(new Scanner(System.in).nextInt());
            } catch (InvalidPositionException ex) {
                System.out.println(ex.getMessage() +" Please re-enter the position..");
                continue;
            }

            String message = ticTacToeGame.playGame(boardIndex[0], boardIndex[1], player.getPlayerSymbol());

            ticTacToeBoard.displayBoard();
            System.out.println(message);

            if (message.equals(EMPTY_STRING)) {
                player = player.switchPlayer(player.getPlayerSymbol());
                continue;
            } else if (message.equals(PLAYER_0_PLAYS_ON_THE_PLAYED_POSITION)
                    || message.equals(PLAYER_X_PLAYS_ON_THE_PLAYED_POSITION)) {
                continue;
            }
            break;
        }
    }
}
