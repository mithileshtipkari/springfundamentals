/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import com.app.repository.HibernateSpeakerRepositoryImpl;
import com.app.repository.SpeakerRepository;
import com.app.service.SpeakerService;
import com.app.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mith1
 */
@Configuration
public class AppConfig {
    
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        //speakerRepository instance is injected using constructor
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        
        //setter injection
        //speakerRepository instance is injected using setter method
//        service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }
    
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
