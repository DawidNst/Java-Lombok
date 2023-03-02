package com.crud.tasks.trello.facade;

import com.crud.tasks.trello.config.TrelloConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
public class TrelloConfingTest {
@Autowired
    private TrelloConfig trelloConfig;


    @Test
    void ApiTest (){
        //given
        //when
        String trelloApiEndpoint = (trelloConfig.getTrelloApiEndpoint());
        //then
       assertEquals(trelloApiEndpoint,"https://api.trello.com/1");
    }
    @Test
    void AppKeyTest(){
        //given
        //when
        String trelloAppKey = (trelloConfig.getTrelloAppKey());
        //then
        assertEquals(trelloAppKey,"6a9cc913614d3d8a0ff8e4fdf830d295");
    }
    @Test
    void TokenTest(){
        //given
        //when
        String trelloToken = (trelloConfig.getTrelloToken());
        //then
        assertNotNull(trelloToken);
        assertEquals(trelloToken,"2a3d26dd5e4ccde9e7d1990f9ffb2048609af9802ea0d12055f280b4e3d13697");
    }
    @Test
    void UserTest(){
        //given
        //when
        String trelloUser = (trelloConfig.getTrelloUser());
        //then
        assertEquals(trelloUser,"DawidNiesterczuk");
    }
}
