package com.app.model;

/**
 *
 * @author Mithilesh
 */
public class Speaker {
    
    private String firstName;
    private String lastName;
    private double seedValue;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSeedValue() {
        return seedValue;
    }

    public void setSeedValue(double seedValue) {
        this.seedValue = seedValue;
    }
    
}
