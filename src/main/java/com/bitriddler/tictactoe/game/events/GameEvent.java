package com.bitriddler.tictactoe.game.events;

import com.bitriddler.tictactoe.game.*;
import com.bitriddler.tictactoe.game.exceptions.InvalidMoveException;
import com.bitriddler.tictactoe.game.players.Player;

public class GameEvent {
    private TicTacToe game;

    public GameEvent(TicTacToe game) {
        this.game = game;
    }

    public void makeMove(Player player, GameMove move) throws InvalidMoveException {
        this.game.makeMove(player, move);
    }

    public Player getWinner() {
        return this.game.getWinner();
    }

    public GameBoard getBoard() {
        return this.game.getBoard();
    }

    public Player getPlayerToMove() {
        return this.game.getPlayerToMove();
    }

    public Player[] getOpponentPlayers() {
        return this.game.getPlayersExcept(this.getPlayerToMove());
    }
}
