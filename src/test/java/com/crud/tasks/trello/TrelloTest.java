package com.crud.tasks.trello;

import com.crud.tasks.domain.Trello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.jupiter.api.Assertions.*;


public class TrelloTest {

    @Autowired
    Trello trello = new Trello();
    @Test
    void TrelloTestMetod() {
        //given
         Trello trello = new Trello ();
         //when
        Integer board = (trello.getBoard());
        // then
        assertEquals(0, board);

    }
    @Test
    void Trellotest(){
        //given
        Trello trello = new Trello ();
        //when
        Integer card = (trello.getCard());
        //then
        assertEquals(0,card);
    }
}
