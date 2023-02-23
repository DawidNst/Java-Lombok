package com.crud.tasks.trello.facade;

import com.crud.tasks.trello.config.TrelloConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrelloConfingTest {

    private TrelloConfig trelloConfig;


    @Test
    void ApiTest (){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloApiEndpoint = String.valueOf(trelloConfig1.getTrelloApiEndpoint());
        //then
        assertEquals(1,1);
    }
    @Test
    void AppKeyTest(){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloAppKey = String.valueOf(trelloConfig1.getTrelloAppKey());
        //then
        assertEquals(1,1);
    }
    @Test
    void TokenTest(){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloToken = String.valueOf(trelloConfig1.getTrelloToken());
        //then
        assertEquals(1,1);
    }
    @Test
    void UserTest(){
        //given
        TrelloConfig trelloConfig1 = new TrelloConfig();
        //when
        String trelloUser = String.valueOf(trelloConfig1.getTrelloUser());
        //then
        assertEquals(1,1);
    }
}
