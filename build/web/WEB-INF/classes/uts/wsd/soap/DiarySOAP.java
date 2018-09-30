/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import uts.wsd.*;

/**
 *
 * @author srd
 */
@WebService(serviceName = "diaryApp")
public class DiarySOAP {

    /**
     * This is a sample web service operation
     */
    @Resource
    private WebServiceContext context;
    // This needs to be local variable in your "getDiaryApp" method
    // It will not work if declared as a field (since field initializers
    // are executed before dependency injection takes place).
    ServletContext application = (ServletContext)context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
    
   private DiaryApplication getDiaryApp() throws JAXBException, IOException, Exception {
  
    synchronized (application) {
     DiaryApplication diaryApp = (DiaryApplication)application.getAttribute("diaryApp");
     if (diaryApp == null) {
      diaryApp = new DiaryApplication();
      diaryApp.setFilePath(application.getRealPath("WEB-INF/users.xml"));
      application.setAttribute("diaryApp", diaryApp);
     }
     return diaryApp;
    }
 }   
    @WebMethod
    public Users fetchUsers() throws IOException, Exception{
         return getDiaryApp().getUsers();
        
    }
    
    @WebMethod
    public User fetchUser(String email) throws IOException, Exception{
        Users users = getDiaryApp().getUsers();
        ArrayList<User> list= users.getList();
    
        for(User u : list){
           if (u.getEmail().equals(email))
                return u;
        }
        return null;
    }
}   
