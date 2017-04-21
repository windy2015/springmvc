package com.liuxch.test;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuxch.modal.User;
import com.liuxch.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/ApplicationContext.xml"})
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void hasMAtchUser() {
    	User user1 = new User();		
		
		user1.setUser_id("admin");
		user1.setPassword("123456");		
		boolean b1 = userService.hasMatchUser(user1);		
		assertTrue(b1); 
    }

    @Test
    public void findUserByUserName() {
         User user1 = new User();		
		
		user1.setUser_id("admin");
        User user = userService.findUserByUserName(user1);
        assertEquals(user.getUser_id(), "admin");

    }

}

