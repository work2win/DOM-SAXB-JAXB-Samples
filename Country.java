/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simujaxb;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author simu
 */
//root element of XML file
@XmlRootElement
@XmlType(propOrder = {"countryName","countryPopulation","listOfStates"})
public class Country {
    private String countryName;
    private double countryPopulation;
    private ArrayList<State> listOfStates;
    
    public Country(){}

    public String getCountryName() {
        return countryName;
    }
    @XmlElement
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }
    @XmlElement
    public void setCountryPopulation(double countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public ArrayList<State> getListOfStates() {
        return listOfStates;
    }
    @XmlElementWrapper(name = "stateList")
    @XmlElement(name = "state")
    public void setListOfStates(ArrayList<State> listOfStates) {
        this.listOfStates = listOfStates;
    }
    
    
    
}
