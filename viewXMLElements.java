/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simudom;
import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
 *
 * @author simu
 * how to visit all elements in a DOM Document
 */
public class viewXMLElements {
    public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse(new FileInputStream(new File("C:\\Users\\simu\\Documents\\NetBeansProjects\\XMLSample\\src\\com\\simudom\\sample.xml")));
		
		NodeList entries = doc.getElementsByTagName("*");
		
		for (int i=0; i<entries.getLength(); i++) {
		    Element element = (Element) entries.item(i);
		    System.out.println("Found element " + element.getNodeName());
		}
		
	}
    
}
