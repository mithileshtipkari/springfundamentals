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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.app.util.CalendarFactory;
import java.util.Calendar;
/**
 *
 * @author mith1
 */
@Configuration
@ComponentScan({"com.app"})
public class AppConfig {
    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }
    
    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }
    
    //Because of @ComponentScan, we don't need to define this method
    /*
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
    */
    
    //Because of @ComponentScan, we don't need to define this method
    /*
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
