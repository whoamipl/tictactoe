package com.hackerspace.tictactoe;

import com.hackerspace.tictactoe.business.State;
import com.hackerspace.tictactoe.rest.FindRest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginRestTest {
    @Mock
    State state;

    @Test
    public void checkReturn() {
        when(state.login()).thenReturn(2137);
        Assert.assertEquals(state.login(), 2137);

        Assert.assertEquals(new FindRest(state).login().getId(), 2137);
    }

}
