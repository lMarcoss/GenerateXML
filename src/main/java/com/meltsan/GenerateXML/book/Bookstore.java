package com.meltsan.GenerateXML.book;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author Marcos Santiago Leonardo
 * Date: 28/09/18
 */

@XmlRootElement(name = "book-store")
public class Bookstore {


    private String xmlns;

    private List<Book> bookList;
    private String name;
    private String location;

    public Bookstore() {
        xmlns = "http://www.uif.shcp.gob.mx/recepcion/tsc";
    }

    public String getXmlns() {
        return xmlns;
    }

    @XmlAttribute(name = "xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @XmlElementWrapper(name = "books")
    @XmlElement(name = "book")
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
