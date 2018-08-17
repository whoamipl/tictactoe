package com.hackerspace.tictactoe.business;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
public interface State {

    int login();//returns new id
    boolean find(int id);//checks if there is user matched with u
    void play(int id);//accepts the game with player



}
