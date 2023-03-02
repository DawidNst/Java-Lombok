package com.crud.tasks.trello.facade;

import com.crud.tasks.domain.AttachmentsByType;
import com.crud.tasks.domain.Trello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttachmentsByTypeTest {

@Autowired
Trello trello = new Trello();
    @Test
    void SimpleTest() {
        //given
        AttachmentsByType attachmentsByType = new AttachmentsByType();
        //when
        Trello trello =(attachmentsByType.getTrello());
        //then
        assertTrue(true,"private");
    }
}
