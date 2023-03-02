package com.crud.tasks.trello.facade;

import com.crud.tasks.mapper.config.AdminConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class AdminTest {
@Autowired
     AdminConfig adminConfig;

    @Test
    void AdminConTest(){
        //given
        //when
        String adminConfig1 =(adminConfig.getAdminMail());
        //then
        assertEquals(adminConfig1,"dawidniesterczuk@gmail.com");

    }
}
