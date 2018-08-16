/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

/**
 *
 * @author sharad
 */
import java.util.*;
import java.io.*;
import javax.xml.bind.*;
 
public class TestJAXB implements Serializable {
 public static void main(String[] args) throws Exception {
  Users users = new Users();
  users.addUser(new User("ryan@ryanheise.com", "Ryan Heise", "blahblah", "male", "green"));
  users.addUser(new User("joe@bloggs.com", "Joe Bloggs", "foobar", "male", "yellow"));
  // Boilerplate code to convert objects to XML...
  JAXBContext jc = JAXBContext.newInstance(Users.class);
  Marshaller m = jc.createMarshaller();
  m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
  m.marshal(users, System.out);
  
 }
}