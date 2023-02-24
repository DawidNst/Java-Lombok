package com.crud.tasks.trello;

import com.crud.tasks.domain.Trello;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrelloTest {

    private Trello trello;
    @Test
    void TrelloTestMetod() {
        //given
         Trello trello = new Trello ();
         //when
        String board = String.valueOf(trello.getBoard());
        // then
        equals(board);

    }
    @Test
    void Trellotest(){
        //given
        Trello trello = new Trello ();
        //when
        String card = String.valueOf(trello.getCard());
        //then
        assertEquals(1,1);
    }
}
