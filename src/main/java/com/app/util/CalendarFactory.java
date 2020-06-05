/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.util;

import org.springframework.beans.factory.FactoryBean;
import java.util.Calendar;
/**
 *
 * @author mith1
 */
public class CalendarFactory implements FactoryBean<Calendar>{
    
    private Calendar instance = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
    
    public void addDays(int num){
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
    
}
