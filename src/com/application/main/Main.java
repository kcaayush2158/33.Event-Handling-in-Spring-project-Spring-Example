package com.application.main;

import com.application.model.Message;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        System.out.println("---------------------------------------------------");
        Message message = context.getBean("message",Message.class);

        System.out.println(message.getMessageId()+"\t"+message.getMessageName());
        System.out.println("---------------------------------------------------");
        context.stop();
    }
}
