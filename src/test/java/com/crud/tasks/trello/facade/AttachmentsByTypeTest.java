package com.crud.tasks.trello.facade;

import com.crud.tasks.domain.AttachmentsByType;
import com.crud.tasks.domain.Trello;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttachmentsByTypeTest {

    private AttachmentsByType attachmentsByType;
    private Trello trello;

    @Test
    void SimpleTest() {
        //given
        AttachmentsByType attachmentsByType = new AttachmentsByType();

        //when
        String trello = String.valueOf(attachmentsByType.getTrello());

        //then
        assertEquals(false,trello.equals(1));

    }
}
