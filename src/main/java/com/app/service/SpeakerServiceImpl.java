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

/**
 *
 * @author mith1
 */
public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository speakerRepository;// = new HibernateSpeakerRepositoryImpl(); //remove hardcoded assignment

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("ctor based injection");
        this.speakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        //setter will be called to populate the dependency because be defined the dependent bean in applicationContext.xml
        System.out.println("setter called");
        this.speakerRepository = speakerRepository;
    }
    
    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
