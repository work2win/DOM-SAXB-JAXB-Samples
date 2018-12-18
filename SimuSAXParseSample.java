/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simusax;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author simu
 */
public class SimuSAXParseSample {
  public static void main(String[] args) {

      try {
         File inputFile = new File("C:\\Users\\simu\\Documents\\NetBeansProjects\\XMLSample\\src\\com\\simusax\\input.txt");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         SimuHandler userhandler = new SimuHandler();
         saxParser.parse(inputFile, userhandler);     
      } catch (Exception e) {
         e.printStackTrace();
      }
   }   
}

