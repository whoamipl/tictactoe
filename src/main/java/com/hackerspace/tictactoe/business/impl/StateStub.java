package com.hackerspace.tictactoe.business.impl;

import com.hackerspace.tictactoe.business.State;
import org.springframework.stereotype.Component;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
@Component
public class StateStub implements State {

    @Override
    public int login() {
        return 2137;
    }

    @Override
    public boolean find(int id) {
        return true;
    }

    @Override
    public void play(int id) {

    }
}
