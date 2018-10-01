package com.meltsan.GenerateXML;

import com.meltsan.GenerateXML.book.Book;
import com.meltsan.GenerateXML.book.Bookstore;
import com.meltsan.GenerateXML.customer.Custormer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcos Santiago Leonardo
 * Date: 28/09/18
 */
public class GenerateXmlMain {
    public static void main(String[] args) {
        Custormer custormer = new Custormer();
        custormer.setId(1);
        custormer.setName("Leo");
        custormer.setAge(24);

        Book book = new Book();
        book.setName("Libro 1");
        book.setAuthor("Leonardo Marcos Santiago");
        book.setIsbn("7dsa89d78sa-as9d8as9d8as-dsa");
        book.setPublisher("Harpercollins");

        List<Book> list = new ArrayList<>();
        list.add(book);
        list.add(book);
        list.add(book);
        list.add(book);
        list.add(book);

        Bookstore bookstore = new Bookstore();
        bookstore.setXmlns("http://www.uif.shcp.gob.mx/recepcion/tsc");
        bookstore.setBookList(list);
        bookstore.setName("Nombre biblioteca");
        bookstore.setLocation("Ubicación biblioteca");

        GenericGenerateXML genericGenerateXML = new GenericGenerateXML();
        System.out.println("*********************************customer.xml*********************************");
        genericGenerateXML.generateXML(custormer, "custormer.xml", "http://www.uif.shcp.gob.mx/recepcion/tsc tsc.xsd",Custormer.class);
        System.out.println("***********************************book.xml***********************************");
        genericGenerateXML.generateXML(book, "book.xml", "http://www.uif.shcp.gob.mx/recepcion/tsc tsc.xsd",Book.class);
        System.out.println("*********************************bookstore.xml*********************************");
        genericGenerateXML.generateXML(bookstore, "bookstore.xml", "http://www.uif.shcp.gob.mx/recepcion/tsc tsc.xsd",Bookstore.class);

    }

}
