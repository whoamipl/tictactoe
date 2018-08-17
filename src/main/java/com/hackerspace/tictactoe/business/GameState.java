package com.hackerspace.tictactoe.business;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
public class GameState {
    GameStateEnum gameStateEnum;
    char[][] data;
    //x_o
    //o_o
    //xxx

    public GameState(GameStateEnum gameStateEnum, char[][] data) {
        this.gameStateEnum = gameStateEnum;
        this.data = data;
    }

    public GameStateEnum getGameStateEnum() {
        return gameStateEnum;
    }

    public char[][] getData() {
        return data;
    }
}
