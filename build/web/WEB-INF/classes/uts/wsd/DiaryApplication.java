/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author sharad
 */

/**
 *
 *  Upon setting the filePath property, the bean should
 * attempt to load the list of users from the XML file 
* at the location filePath and then store the loaded users
* object into the users property. 
* Upon setting the filePath property, 
* the bean should attempt to load the list of users
* from the XML file at the location filePath and then 
* store the loaded users object into the users property.
 */

public class DiaryApplication {
    
    private String filePath;
    private Users users;
//    public Users u;
    
    public DiaryApplication() {
        
    }  
   
    public String getFileName() {
        return filePath;
    }
    
    public void setFilePath(String filePath) throws Exception  {                   
      this.filePath = filePath;
      JAXBContext jb = JAXBContext.newInstance(Users.class);
      Unmarshaller u = jb.createUnmarshaller();
      FileInputStream fin = new FileInputStream(filePath);
      users = (Users) u.unmarshal(fin);
      fin.close();
    }
    
   
    public Users getUsers() {
	return users;
    }
    
    
    public void setUsers(Users users) {
        this.users = users;
    }
    
}
