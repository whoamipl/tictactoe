package com.hackerspace.tictactoe.rest;

import com.hackerspace.tictactoe.business.State;
import com.hackerspace.tictactoe.rest.model.Login;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
@RestController
public class LoginRest {
    private final State state;

    LoginRest(State state) {
        this.state = state;
    }

    @RequestMapping("/rest/find/{$id}")
    public ResponseEntity<Object> find(@PathVariable(value="id") int id) {
        if(state.find(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
