/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simudom;
import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 *
 * @author simu
 */
public class removeAttributeDOM {
    
    public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse(new FileInputStream(new File("C:\\Users\\simu\\Documents\\NetBeansProjects\\XMLSample\\src\\com\\simudom\\sample.xml")));
		
		Element element = (Element) doc.getElementsByTagName("channel").item(0);
		
		// whether an attribute with a given name is specified on this element or has a default value
		boolean hasAttribute = element.hasAttribute("premium");
		System.out.println("Has Attribute: " + hasAttribute);
		System.out.println("Attribute Value: " + element.getAttribute("premium"));
		System.out.println();

		// Removes an attribute by name. If a default value for the removed attribute
		// is defined in the DTD, a new attribute immediately appears with the default value
		element.removeAttribute("premium");

		prettyPrint(doc);
		
	}
    public static final void prettyPrint(Document xml) throws Exception {
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(xml), new StreamResult(out));
		System.out.println(out.toString());
	}
    
}
