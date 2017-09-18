/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.adf2.testjava.enity;

/**
 *
 * @author Nam Nguyen
 */
public class Passenger {

    private int iDRevervation;
    private String passengerName;
    private String address;
    private String Phone;
    private String dateOfDeparture_Return;

    public Passenger() {
    }

    public int getIDRevervation() {
        return iDRevervation;
    }

    public void setIDRevervation(int iDRevervation) {
        this.iDRevervation = iDRevervation;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDateOfDeparture_Return() {
        return dateOfDeparture_Return;
    }

    public void setDateOfDeparture_Return(String dateOfDeparture_Return) {
        this.dateOfDeparture_Return = dateOfDeparture_Return;
    }

}
