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
    
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    
    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
