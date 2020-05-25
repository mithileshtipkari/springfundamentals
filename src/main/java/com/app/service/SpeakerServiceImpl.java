/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.model.Speaker;
import com.app.repository.HibernateSpeakerRepositoryImpl;
import com.app.repository.SpeakerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mith1
 */
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    
    @Autowired //- if you Autowire the field of class, it directly gets injected
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args ctor");
    }
    
//    @Autowired //- if you Autowire parameterized ctor(Any method) of class, the it's parameters are injected
    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl ctor");
        repository = speakerRepository;
    }
    
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    //Autowired setter method, the speakerRepository instance will be injected here
    //@Autowired //- if you Autowire any method of class, the it's parameters are injected
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = speakerRepository;
    }
}
