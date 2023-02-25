package com.crud.tasks.trello.facade;

import com.crud.tasks.mapper.config.AdminConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AdminTest {

    private AdminConfig adminConfig;

    @Test
    void AdminTest(){
        //given
        AdminConfig adminConfig = new AdminConfig();
        //when
        String adminConfig1 = String.valueOf(adminConfig.getAdminMail());
        //then
        assertNotNull(adminConfig);
        assertEquals(false,adminConfig.equals(1));


    }
}
