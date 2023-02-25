package com.crud.tasks.trello.facade;

import com.crud.tasks.mapper.config.AdminConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {


    @Test
    void AdminConTest(){
        //given
        AdminConfig adminConfig = new AdminConfig();
        //when
        String adminConfig1 = String.valueOf(adminConfig.getAdminMail());
        //then
        assertFalse(adminConfig.equals(adminConfig1));



    }
}
