package com.bht.aop.main;

import com.bht.aop.model.User;
import com.bht.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {

        run
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AopConfig.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        userService.getUser().setName("Jack Ma");



    }
}
