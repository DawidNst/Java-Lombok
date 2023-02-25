package com.crud.tasks.trello.facade;

import com.crud.tasks.trello.config.TrelloConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TrelloConfingTest {

    private TrelloConfig trelloConfig;


    @Test
    void ApiTest (){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloApiEndpoint = String.valueOf(trelloConfig1.getTrelloApiEndpoint());
        //then
        assertNotNull(trelloApiEndpoint);
        assertEquals(false,trelloApiEndpoint.equals(1));
    }
    @Test
    void AppKeyTest(){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloAppKey = String.valueOf(trelloConfig1.getTrelloAppKey());
        //then
        assertNotNull(trelloAppKey);
        assertEquals(false,trelloAppKey.equals(1));
    }
    @Test
    void TokenTest(){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloToken = String.valueOf(trelloConfig1.getTrelloToken());
        //then
        assertNotNull(trelloToken);
        assertEquals(false,trelloToken.equals(1));
    }
    @Test
    void UserTest(){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloUser = String.valueOf(trelloConfig1.getTrelloUser());
        //then
        assertNotNull(trelloUser);
        assertEquals(false,trelloUser.equals(1));
    }
}
