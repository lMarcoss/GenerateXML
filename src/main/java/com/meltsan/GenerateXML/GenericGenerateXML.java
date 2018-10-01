package com.meltsan.GenerateXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * @author Marcos Santiago Leonardo
 * Date: 28/09/18
 */
public class GenericGenerateXML<T> {

    public GenericGenerateXML() {
    }

    public void generateXML(T objectToXml, String nameFile, String schemaLocation, Class<T> nameClass) {
        File file = new File(nameFile);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(nameClass);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // ouput pretty printer
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation);

            jaxbMarshaller.marshal(objectToXml, file);
            jaxbMarshaller.marshal(objectToXml, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
