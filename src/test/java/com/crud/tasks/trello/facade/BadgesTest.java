package com.crud.tasks.trello.facade;

import com.crud.tasks.domain.Badges;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class BadgesTest {

    @Autowired
    Badges badges = new Badges();

    @Test
    void VotesTest() {
        //given
        Badges badges = new Badges ();
        //when
        Integer votes = (badges.getVotes());
        // then
        assertEquals(0,votes);
    }
    @Test
    void AttachmentsByTypeTest(){
        //given
        Badges badges = new Badges();
        //when
        String attachmentsByType = String.valueOf((badges.getAttachmentsByType()));
        //then
        assertNotNull(attachmentsByType);
    }
    @Test
    void BadgesTest(){
        //given
        Badges badges1 = new Badges();
        //when
        String badges = (badges1.toString());
        //then
        assertNotNull(badges);
    }
}
