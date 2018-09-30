package uts.wsd.rest;
 
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;
import java.io.*;
import java.util.ArrayList;
import uts.wsd.DiaryApplication;
import uts.wsd.User;
import uts.wsd.Users;
 
@Path("/diaryApp")
public class DiaryService {
 @Context
 private ServletContext application;
 
 private DiaryApplication getDiaryApp() throws JAXBException, IOException, Exception {
  // The web server can handle requests from different clients in parallel.
  // These are called "threads".
  //
  // We do NOT want other threads to manipulate the application object at the same
  // time that we are manipulating it, otherwise bad things could happen.
  //
  // The "synchronized" keyword is used to lock the application object while
  // we're manpulating it.
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
 
 @GET
 @Path("users")
 @Produces(MediaType.APPLICATION_XML)
 public Users getUsers() throws IOException, Exception {
      return getDiaryApp().getUsers();
  
 }
 
 @Path("/users/{email}")
 @GET
 @Produces(MediaType.APPLICATION_XML)
 public User getUser(@PathParam("email") String email) throws IOException, Exception {
    Users users = getDiaryApp().getUsers();
    ArrayList<User> list= users.getList();
    
    for(User u : list){
      if (u.getEmail().equals(email))
                return u;
    }
    return null;
 }
 

 @POST
 @Path("/users")
 @Consumes(MediaType.APPLICATION_XML)
 public void addUser(User user) throws Exception {
        String filePath = application.getRealPath("WEB-INF/users.xml");
        DiaryApplication dApp = getDiaryApp();
        dApp.setFilePath(filePath);
        Users users = getDiaryApp().getUsers();
        users.addUser(user);
        dApp.saveUsers(users, filePath); 
    }
}