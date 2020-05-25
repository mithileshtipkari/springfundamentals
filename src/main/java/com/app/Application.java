/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import com.app.service.SpeakerService;
import com.app.service.SpeakerServiceImpl;

/**
 *
 * @author mith1
 */
public class Application {
    
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
