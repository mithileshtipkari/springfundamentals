/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repository;

import com.app.model.Speaker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mith1
 */
@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    
    //This will give java.util.Calendar
    //private Calendar cal = Calendar.getInstance();
    
    //This will give our Calendar instance manipulated in the factory bean
    @Autowired
    private Calendar cal;

    public HibernateSpeakerRepositoryImpl() {
        System.out.println("HibernateSpeakerRepositoryImpl no args Constructor");
    }

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("mith");
        speaker.setLastName("tips");
        
        System.out.println("Just date -"+ cal.getTime());;
        
        speakers.add(speaker);
        return speakers;
    }
}
