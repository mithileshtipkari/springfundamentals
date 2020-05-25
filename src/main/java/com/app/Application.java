/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import com.app.service.SpeakerService;
import com.app.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author mith1
 */
public class Application {
    
    public static void main(String[] args) {
        //Normal Hardcoded assignment of dependencies
//        SpeakerService speakerService = new SpeakerServiceImpl();

        //Using Application context to fetch instance of beans and then use them as we want
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
