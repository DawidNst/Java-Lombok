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
        votes.isEmpty();
        assertEquals(0,badges.getVotes());
    }
    @Test
    void AttaTest(){
        //given
        Badges badges = new Badges();
        //when
        String attachmentsByType = String.valueOf(badges.getAttachmentsByType());
        //then
        attachmentsByType.isEmpty();
        assertEquals(null, badges.getAttachmentsByType());
    }
    @Test
    void BadgesTest(){
        //given
        Badges badges1 = new Badges();
        //when
        String badges = String.valueOf(badges1.getBadges());
        //then
        badges.isEmpty();
        assertEquals(null,badges1.getBadges());
    }
}
