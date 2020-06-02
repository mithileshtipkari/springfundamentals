/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import com.app.service.SpeakerService;
import com.app.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mith1
 */
public class Application {
    
    public static void main(String[] args) {
//        SpeakerService speakerService = new SpeakerServiceImpl(); //direct hardcoding
        
        //set application centext and fetch the required bean by name or class
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
