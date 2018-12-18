/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simu
 */


package com.simujaxb;
import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBSample {
public static void main(String[] args) {

  // creating country object
   Country countryIndia=new Country();  
   countryIndia.setCountryName("India");
   countryIndia.setCountryPopulation(5000000);

   // Creating listOfStates
   ArrayList<State> stateList=new ArrayList<State>();
   State mpState=new State("Madhya Pradesh",1000000);
   stateList.add(mpState);
   State maharastraState=new State("Maharastra",2000000);
   stateList.add(maharastraState);

   countryIndia.setListOfStates(stateList);

  try {

   // create JAXB context and initializing Marshaller
   JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
   Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

   // for getting nice formatted output
   jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

   //specify the location and name of xml file to be created
   File XMLfile = new File("C:\\Users\\simu\\Documents\\NetBeansProjects\\XMLSample\\src\\com\\simujaxb\\CountryRecord.xml");

   // Writing to XML file
   jaxbMarshaller.marshal(countryIndia, XMLfile); 
   // Writing to console
   jaxbMarshaller.marshal(countryIndia, System.out); 

  } catch (JAXBException e) {
   // some exception occured
   e.printStackTrace();
  }

 }
}