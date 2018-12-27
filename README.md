# DOM-SAXB-JAXB



Parsing of XML documents

The Document Object Model (DOM) is an official recommendation of the World Wide Web Consortium (W3C)

The Java DOM and SAX parsing APIs are lower-level APIs to parse XML documents, while JAXB (Java API for XML Binding) is a higher-level API for converting XML elements and attributes to a Java object hierarchy.

SAX parser is different from DOM parser because it doesn’t load complete XML into memory and read xml document sequentially.

DOM parser is faster than SAX because it access whole XML document in memory

SAX parser in Java is better suitable for large XML file than DOM Parser because it doesn't require much memory.

DOM parser works on Document Object Model while SAX is an event based XML parser.

People prefer to use JAXB rather than DOM and SAX

JAXB provides a mechanism to convert Java Object to XML document and XML document to Java Object.It is used to convert XML to java object and java object to XML.JAXB defines an API for reading and writing Java objects to and from XML documents.Unlike SAX and DOM,we don’t need to be aware of XML parsing techniques.

There are two operations you can perform using JAXB

Marshalling :Converting a java object to XML
UnMarshalling :Converting a XML to java objectIn Java, there are various ways to convert Java Object to XML document and vice versa some known once are

 In Java, there are various ways to convert Java Object to XML document and vice versa some known once are

1.DOM (Document Object Model) : Which uses DocumentBuilderFactory to convert Java Object to XML
2.SAX (Simple API for XML) : It uses ContentHandler interface and its callback methods such as void startDocument() , void endDocument() 
3.JAXB (Java Architecture for XML binding): it is an annotation based parsing method in which POJO class is used with setter and getter methods and XML elements as fields.
