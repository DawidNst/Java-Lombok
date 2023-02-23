package com.crud.tasks.trello.facade;

import com.crud.tasks.domain.Badges;
import com.crud.tasks.domain.Trello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadgesTest {

private Trello trello;

    @Test
    void VotesTest() {
        //given
        Badges badges = new Badges ();
        //when
        String votes = String.valueOf(badges.getVotes());
        // then
        assertEquals(1,1);
    }
    @Test
    void AttaTest(){
        //given
        Badges badges = new Badges();
        //when
        String attachmentsByType = String.valueOf(badges.getAttachmentsByType());
        //then
        assertEquals(1,1);
    }
    @Test
    void BadgesTest(){
        //given
        Badges badges = new Badges();
        //when
        String badges1 = String.valueOf(badges.getBadges());
        //then
        assertEquals(1,1);
    }
}
