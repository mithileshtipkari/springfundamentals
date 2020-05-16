/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.model.Speaker;
import java.util.List;

/**
 *
 * @author mith1
 */
public interface SpeakerService {

    List<Speaker> findAll();
    
}
