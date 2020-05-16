/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repository;

import com.app.model.Speaker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mith1
 */
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("mith");
        speaker.setLastName("tips");
        
        speakers.add(speaker);
        return speakers;
    }
}
