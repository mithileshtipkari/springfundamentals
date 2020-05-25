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
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author mith1
 */
@Configuration
public class AppConfig {
    
    //sets scope of bean to prototype, each time this method is called a new instance will be created
    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE) 
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        //Constructor Injection
        //speakerRepository instance is injected using constructor 
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        
        //setter injection
        //speakerRepository instance is injected using setter method
//        service.setSpeakerRepository(getSpeakerRepository());

        //Autowired setter injection
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }
    
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
