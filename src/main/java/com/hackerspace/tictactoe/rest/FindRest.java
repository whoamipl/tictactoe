package com.hackerspace.tictactoe.rest;

import com.hackerspace.tictactoe.business.State;
import com.hackerspace.tictactoe.rest.model.Login;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
@RestController
public class FindRest {
    private final State state;

    FindRest(State state) {
        this.state = state;
    }

    @RequestMapping("/rest/login")
    public Login login() {
        return new Login(state.login());
    }
}
